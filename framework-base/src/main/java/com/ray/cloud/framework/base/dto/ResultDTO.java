package com.ray.cloud.framework.base.dto;

/**
 * @Author: ZhangRui
 * @Description:
 * @date: Created in 14:42 2018/3/28
 * @Modified By:
 */

import java.util.Arrays;
import java.util.List;

public class ResultDTO<T> {
    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;
    private int code;
    private T data;
    private List<ResultError> errors;

    private ResultDTO() {
    }

    private ResultDTO(int code) {
        this.code = code;
    }

    private ResultDTO(int code, T data) {
        this.code = code;
        this.data = data;
    }

    private ResultDTO(int code, List<ResultError> errors) {
        this.code = code;
        this.errors = errors;
    }

    public static ResultDTO success() {
        return new ResultDTO(0);
    }

    public static <T> ResultDTO success(T data) {
        return new ResultDTO(0, data);
    }

    public static ResultDTO failure() {
        return new ResultDTO(1);
    }

    public static ResultDTO failure(ResultError... errors) {
        return null != errors && errors.length != 0 ? new ResultDTO(1, Arrays.asList(errors)) : failure();
    }

    public boolean isSuccess() {
        return this.code == 0;
    }

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public List<ResultError> getErrors() {
        return this.errors;
    }
}