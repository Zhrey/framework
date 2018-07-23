package com.ray.cloud.framework.base.Enum;

/**
 * @Author: ZhangRui
 * @Description:
 * @date: Created in 15:51 2018/4/26
 * @Modified By:
 */
public enum BaseFlagEnum {

    NON_DELETE("非删除"), DELETE("删除");

    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private BaseFlagEnum(String name) {
        this.name = name;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
