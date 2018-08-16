package com.ray.cloud.framework.base.dto;

/**
 * @Author: ZhangRui
 * @Description:
 * @date: Created in 14:42 2018/3/28
 * @Modified By:
 */
import java.util.List;

public class PageResultDTO<ENTITY> {
    private long total;
    private List<ENTITY> rows;

    private PageResultDTO() {
    }

    private PageResultDTO(long total, List<ENTITY> rows) {
        this.total = total;
        this.rows = rows;
    }

    public static <ENTITY> PageResultDTO rows(long total, List<ENTITY> rows) {
        return new PageResultDTO(total, rows);
    }

    public long getTotal() {
        return this.total;
    }

    public List<ENTITY> getRows() {
        return this.rows;
    }
}

