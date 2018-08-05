package com.ray.cloud.framework.file.sdk.dto;

import com.ray.cloud.framework.base.dto.AbstractDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ZhangRui on 2018/8/5.
 */
public class FileBaseDTO extends AbstractDTO{

    //附件名称
    @Getter
    private String fileName;
    //附件地址
    @Getter
    @Setter
    private String filePath;
    //附件类型
    @Getter
    @Setter
    private Integer fileType;

    public void setFileName(String name) {

        this.fileName = name + "_" + System.currentTimeMillis();

    }



}
