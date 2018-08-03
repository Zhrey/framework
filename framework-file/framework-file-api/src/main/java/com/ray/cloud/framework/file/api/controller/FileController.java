package com.ray.cloud.framework.file.api.controller;

import com.ray.cloud.framework.file.api.client.FastDFSPoolClient;
import com.ray.cloud.framework.file.api.utils.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * 文件系统contrller层
 *
 * @author SL
 * @date 2018/01/18
 */
@Controller
@RequestMapping("/file")
@Slf4j
public class FileController {
    @Autowired
    private FastDFSPoolClient fastDFSClient;

    /**
     * 上传文件
     *
     * @return
     * @author SL
     * @date 2018-1-30
     */
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> uploadFile(@RequestParam("file") MultipartFile multipartFile) {// TODO 参数驼峰命名
        try {
            Map<String, Object> data = fastDFSClient.uploadFile(multipartFile.getBytes(), multipartFile.getOriginalFilename());
            return data;
        } catch (IOException e) {
            log.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping("/")
    public String home() {
        return "upload";
    }

    /**
     * 根据文件流上传文件
     *
     * @return
     * @author SL
     * @date 2018-1-30
     */
//    @RequestMapping(value = "/uploadByteFile", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> uploadByteFile(@RequestBody FileByteDto filebytedto) {
//        Map<String, Object> data = fastDFSClient.uploadFile(filebytedto.getBuff(), filebytedto.getFileName());
//        return data;
//    }

    /**
     * 下载文件
     *
     * @return
     * @author SL
     * @date 2018-1-30
     * CrossOrigin 使用注解方式添加跨域访问消息头
     */
    @RequestMapping(value = "/downloadfile", method = RequestMethod.GET)// TODO 路径驼峰命名
    @CrossOrigin
    public void getFileByPath(String filePath, String fileName, HttpServletResponse response) {// TODO 缺乏http注解
        try {
            //解决返回中文乱码的问题  TODO 这种写法只能解决简体中文的乱码
            String filename = new String(fileName.getBytes("gb2312"), "ISO8859-1");
            // 判断文件是否存在
            if (fastDFSClient.getFileInfo(filePath) != null) {
                byte[] buffer = fastDFSClient.downloadFile(filePath);
                // 清空response
                response.reset();
                // 设置response的Header
                response.addHeader("Content-Disposition",
                        "attachment;filename=" + filename + FileUtil.getOriginalFilename(filePath));
                response.addHeader("Content-Length", "" + buffer.length);
                // 通过文件流的形式写到客户端
                OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
                response.setContentType("application/octet-stream");
                toClient.write(buffer);
                // 写完以后关闭文件流
                toClient.flush();
                toClient.close();
            }
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    /**
     * 批量下载文件
     *
     * @return
     * @author SL
     * @date 2018-1-30
     * CrossOrigin 使用注解方式添加跨域访问消息头
     */
//    @RequestMapping(value = "/downloadFiles", method = RequestMethod.GET)// TODO 路径驼峰命名
//    @CrossOrigin
//    public void getFiles(String contName, String fileByteDtoList, HttpServletResponse response) {
//        List<File> files = new ArrayList<File>();
//        List<FileByteDto> fbList = JSON.parseArray(fileByteDtoList, FileByteDto.class);
//        String storagePath = System.getProperty("java.io.tmpdir") + File.separator;
//        for (FileByteDto fileByteDto : fbList) {
//            if (fastDFSClient.getFileInfo(fileByteDto.getFileId()) != null) {
//                byte[] buffer = fastDFSClient.downloadFile(fileByteDto.getFileId());
//                File f = FileUtil.newFiles(buffer, fileByteDto.getFileName());
//                files.add(f);
//            }
//        }
//        try {
//            //解决返回中文乱码的问题  TODO 这种写法只能解决简体中文的乱码
//            String contNameRes = new String(contName.getBytes("gb2312"), "ISO8859-1");
//            File zipfile = new File(storagePath + "\\" + contName + ".zip");
//            FileUtil.zipFiles(files, zipfile);
//            FileInputStream fis = new FileInputStream(zipfile);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
//            byte[] b = new byte[1000];
//            int n;
//            while ((n = fis.read(b)) != -1) {
//                bos.write(b, 0, n);
//            }
//            fis.close();
//            bos.close();
//            byte[] buffer = bos.toByteArray();
//
//            // 清空response
//            response.reset();
//            // 设置response的Header
//            response.addHeader("Content-Disposition",
//                    "attachment;filename=" + contNameRes + ".zip");
//            response.addHeader("Content-Length", "" + buffer.length);
//            // 通过文件流的形式写到客户端
//            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
//            response.setContentType("application/octet-stream");
//            toClient.write(buffer);
//            // 写完以后关闭文件流
//            toClient.flush();
//            toClient.close();
//            zipfile.delete();
//        } catch (IOException e) {
//            log.error(e.getMessage());
//        }
//        //删除服务器临时文件
//        for (File f : files) {
//            boolean b = f.delete();
//        }
//    }


    /**
     * 打包合同文件下载
     *
     * @return
     * @author SL
     * @date 2018-1-30
     * CrossOrigin 使用注解方式添加跨域访问消息头
     */
//    @RequestMapping(value = "/downloadCountFiles", method = RequestMethod.GET)// TODO 路径驼峰命名
//    @CrossOrigin
//    public void getCountFiles(String countList, HttpServletResponse response) {
//        String storagePath = System.getProperty("java.io.tmpdir") + File.separator;
//        List<SearchResultDTO> fbList = JSON.parseArray(countList, SearchResultDTO.class);
//        List<File> zipfiles = new ArrayList<File>();
//        for (SearchResultDTO searchResultDTO : fbList) {
//            ReqFileDto reqfileDto = new ReqFileDto();
//            reqfileDto.setCountId(searchResultDTO.getId());
//            reqfileDto.setDataFlag(DataFlagEnum.FUNCTIONAL.getValue());
//            // 文件查询
//            ResultDTO<List<ReqFileDto>> fileResultDto = fileDespSdkService.selectSdkFile(reqfileDto);
//            List<FileByteDto> fileByteDtos = new ArrayList<>();
//            List<File> files = new ArrayList<File>();
//            for (ReqFileDto reqFileDto : fileResultDto.getData()) {
//                byte[] buffer = fastDFSClient.downloadFile(reqFileDto.getFilePath());
//                File f = FileUtil.newFiles(buffer, reqFileDto.getName());
//                files.add(f);
//            }
//            File zipfile = new File(storagePath + "\\" + searchResultDTO.getContractName() + ".zip");
//            FileUtil.zipFiles(files, zipfile);
//            zipfiles.add(zipfile);
//            //删除服务器临时文件
//            for (File f : files) {
//                boolean delflag = f.delete();
//            }
//        }
//        try {
//            String TimeNow = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
//            String filename = TimeNow+"+"+zipfiles.size()+"份合同";
//            String contNameRes = new String(filename.getBytes("gb2312"), "ISO8859-1");
//            File zipfile = new File(storagePath + "\\" +filename +".zip");
//            FileUtil.zipFiles(zipfiles, zipfile);
//            System.out.println(fbList);
//            FileInputStream fis = new FileInputStream(zipfile);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
//            byte[] b = new byte[1000];
//            int n;
//            while ((n = fis.read(b)) != -1) {
//                bos.write(b, 0, n);
//            }
//            fis.close();
//            bos.close();
//            byte[] buffer = bos.toByteArray();
//
//            // 清空response
//            response.reset();
//            // 设置response的Header
//            response.addHeader("Content-Disposition",
//                    "attachment;filename=" + contNameRes + ".zip");
//            response.addHeader("Content-Length", "" + buffer.length);
//            // 通过文件流的形式写到客户端
//            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
//            response.setContentType("application/octet-stream");
//            toClient.write(buffer);
//            // 写完以后关闭文件流
//            toClient.flush();
//            toClient.close();
//            zipfile.delete();
//            //删除服务器临时文件
//            for (File f : zipfiles) {
//                boolean c = f.delete();
//            }
//        } catch (IOException e) {
//        log.error(e.getMessage());
//    }
//    }

    /**
     * 获得文件流
     *
     * @return
     * @author SL
     * @date 2018-1-30
     */
//    @RequestMapping(value = "/downloadfilebuffer/{path}", method = RequestMethod.GET)// TODO 路径驼峰命名
//    @ResponseBody
//    public ResultDTO getFileBufferByPath(@PathVariable String path) {
//        // 判断文件是否存在
//        if (StringUtils.isNotEmpty(path)) {
//            byte[] buffer = fastDFSClient.downloadFile(path);
//            return ResultDTO.success(buffer);
//        }
//        return ResultDTO.success();
//    }
}
