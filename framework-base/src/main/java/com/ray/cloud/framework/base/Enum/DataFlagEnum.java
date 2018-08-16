package com.ray.cloud.framework.base.Enum;

/**
 * @Author: ZhangRui
 * @Description:
 * @date: Created in 14:54 2018/3/28
 * @Modified By:
 */
public enum DataFlagEnum {

    NON_DELETE("非删除"), DELETE("删除");

    // 成员变量
    private String name;

    // 构造方法
    DataFlagEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
