package org.example.base;

import java.io.Serializable;

/**
 * 封装分页请求参数
 */
public class QueryRequest implements Serializable {

    private static final long serialVersionUID = -4869594085374385813L;

    /**
     * 当前页
     */

//    @NotNull(message = "{required}")
    private Integer pageNum;

    /**
     * 每页展示条数
     */
//    @NotNull(message = "{required}")
    private Integer pageSize;

//    /**
//     * 排序字段
//     */
//    private String sortField;
//
//    /**
//     * 排序方式，ASC/DESC
//     */
//    private String sortOrder;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        //设置默认值:1
        this.pageNum = pageNum == null ? 1 : pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        //设置默认值:10
        this.pageSize = pageSize == null ? 10 : pageSize;
    }

//    public String getSortField() {
//        return sortField;
//    }
//
//    public void setSortField(String sortField) {
//        this.sortField = sortField;
//    }
//
//    public String getSortOrder() {
//        return sortOrder;
//    }
//
//    public void setSortOrder(String sortOrder) {
//        this.sortOrder = sortOrder;
//    }
}