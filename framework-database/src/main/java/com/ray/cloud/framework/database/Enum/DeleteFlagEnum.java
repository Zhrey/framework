package com.ray.cloud.framework.database.Enum;

/**
 * @Author: ZhangRui
 * @Description:
 * @date: Created in 14:54 2018/3/28
 * @Modified By:
 */
public enum  DeleteFlagEnum {

    NON_DELETE("非删除"), DELETE("删除");

    // 成员变量
    private String name;

    // 构造方法
    DeleteFlagEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
