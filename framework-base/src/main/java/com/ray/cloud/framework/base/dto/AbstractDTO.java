package com.ray.cloud.framework.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangrui
 */
@Data
public abstract class AbstractDTO implements Serializable{

    private String id;

    public AbstractDTO() {
    }

    public AbstractDTO(String id) {
        this.id = id;
    }
}
