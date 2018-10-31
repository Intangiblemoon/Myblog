package my.bauble.blog.utils;

import java.util.List;

/**
 * @author wensiao
 * @date 2018-10-31 15:51
 **/
public class PageResult<T> {

    /**
     * 页码
     */
    private int page;
    /**
     * 页容量
     */
    private int rows;

    /**
     * 总数量
     */
    private long total;
    /**
     * 总页数
     */
    private long totalPage;
    /**
     * 总数据
     */
    private List<T> data;

    public PageResult() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PageResult(int page, int rows, long total, long totalPage, List<T> data) {
        this.page = page;
        this.rows = rows;
        this.total = total;
        this.totalPage = totalPage;
        this.data = data;
    }
}