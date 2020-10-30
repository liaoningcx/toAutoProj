package com.auto.common;

import java.util.List;

/**
 * Created by caoxue on 2016/8/30.
 */
public class Page<T> {

    private int currentPage = 1;//当前页
    private int pageSize = 10;//每页个数
    private int totalRowCount;//结果集总个数
    private int totalPage;//总页数
    private List<T> result;//搜索的结果集

    private int offset;//从第几行开始

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean hasNextPage() {
        return this.getPageSize() + 1 <= this.getTotalPage();
    }

    public boolean isLastPage() {
        return !this.hasNextPage();
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if(pageSize > 0) {
            this.pageSize = pageSize;
        }
    }

    public int getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(int totalRowCount) {
        this.totalRowCount = totalRowCount;
    }

    public int getTotalPage() {
        return (int)Math.ceil((double)this.getTotalRowCount() / (double)this.getPageSize());
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getOffset() {
        int page_index = this.getCurrentPage() - 1;
        page_index = page_index < 0?0:page_index;
        return page_index * this.pageSize;
    }

    /**
     * 获取从第几条结果集开始
     * @return 第几条开始
     */
    public int getStartIndex() {
        return (currentPage - 1) * pageSize + 1;
    }
    /**
     * 获取从第几条结果集结束
     * @return 第几条结束
     */
    public int getEndIndex() {
        int end = currentPage * pageSize;
        if (end > totalRowCount) {
            end = totalRowCount;
        }
        return end;
    }
}
