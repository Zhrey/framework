package com.ray.cloud.framework.base.dto;

/**
 * @Author: ZhangRui
 * @Description:
 * @date: Created in 14:42 2018/3/28
 * @Modified By:
 */
import java.util.List;

public class PageResultDTO<ENTITY> {
    private long count;
    private List<ENTITY> result;

    private PageResultDTO() {
    }

    private PageResultDTO(long count, List<ENTITY> result) {
        this.count = count;
        this.result = result;
    }

    public static <ENTITY> PageResultDTO result(long count, List<ENTITY> result) {
        return new PageResultDTO(count, result);
    }

    public long getCount() {
        return this.count;
    }

    public List<ENTITY> getResult() {
        return this.result;
    }
}

