package com.dingwang.seanail.commons;

import java.util.List;

/**
 * 类功能说明:页面分页需要的数据
 * <p><strong></strong></p>
 * @version 
 * @author fangjianyu 2017年10月10日下午1:49:28
 * @since 1.8
 */
public class EasyUIResult {

    private Long total;

    private List<?> rows;

    public EasyUIResult() {
    }

    public EasyUIResult(Long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "EasyUIResult [total=" + total + ", rows=" + rows + "]";
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
