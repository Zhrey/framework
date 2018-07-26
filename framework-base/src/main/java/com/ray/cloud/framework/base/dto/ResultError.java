package com.ray.cloud.framework.base.dto;

/**
 * @Author: ZhangRui
 * @Description:
 * @date: Created in 14:43 2018/3/28
 * @Modified By:
 */

public class ResultError {
    private String message;
    private String field;

    private ResultError() {
    }

    private ResultError(String message) {
        this.message = message;
    }

    private ResultError(String message, String field) {
        this.message = message;
        this.field = field;
    }

    public static ResultError error(String message) {
        return new ResultError(message);
    }

    public static ResultError error(String message, String field) {
        return new ResultError(message, field);
    }

    public String getMessage() {
        return this.message;
    }

    public String getField() {
        return this.field;
    }
}