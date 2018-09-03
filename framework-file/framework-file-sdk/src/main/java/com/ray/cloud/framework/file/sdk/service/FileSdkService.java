package com.ray.cloud.framework.file.sdk.service;

import com.ray.cloud.framework.base.dto.ResultDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;

/**
 * Created by ZhangRui on 2018/8/5.
 */
@FeignClient(value = "framework-file")
public interface FileSdkService {

    @RequestMapping(value = "file/uploadFile", method = RequestMethod.POST)
    ResultDTO uploadFile(@RequestParam("file") File file);

    @RequestMapping(value = "file/downloadFile", method = RequestMethod.GET)
    ResultDTO downloadFile(@RequestParam("filePath") String filePath,@RequestParam("fileName") String fileName);
}
