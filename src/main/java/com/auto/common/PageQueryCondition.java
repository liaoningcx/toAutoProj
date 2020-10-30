package com.auto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 分页查询条件
 * User: admin
 * Date: 13-5-9
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
public class PageQueryCondition<T> implements Serializable {

    private static final long serialVersionUID = -3284694395882955584L;

    public static final int DEFAULT_PAGESIZE = 10;

    private int startIndex;

    /**
     * 当前页
     */
    private int page;

    /**
     * 每页多少项
     */
    private int pageSize;

    /**
     * 排序参数
     */
    private LinkedHashMap<String, String> sortItemMap;

    public LinkedHashMap<String, String> getSortItemMap() {
        return sortItemMap;
    }

    public void setSortItemMap(LinkedHashMap<String, String> sortItemMap) {
        this.sortItemMap = sortItemMap;
    }

    public PageQueryCondition() {
        this(1,  DEFAULT_PAGESIZE);
    }

    public PageQueryCondition(int page) {
        this(page, DEFAULT_PAGESIZE);
    }


    public PageQueryCondition(int page, int pageSize) {
        if (page <= 0) {
            page = 1;
        }
        if (pageSize <= 0) {
            pageSize = DEFAULT_PAGESIZE;
        }
        this.page = page;
        this.pageSize = pageSize;
        this.startIndex = (page-1)*pageSize+1;
    }


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
