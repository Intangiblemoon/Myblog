package my.bauble.blog.model;

import java.time.LocalDateTime;

/**
 *  
 * 表:article 
 * @author IM 
 * @date 2018-10-29 
 */
public class Article {
    /**
     * 
     * 表字段:ID
     */
    private Integer id;

    /**
     * 标题
     * 表字段:TITLE
     */
    private String title;

    /**
     * 内容
     * 表字段:CONTENT
     */
    private String content;

    /**
     * 创建时间
     * 表字段:CREATE_TIME
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     * 表字段:UPDATE_TIME
     */
    private LocalDateTime updateTime;

    /**
     * 获取
     * @return id Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标题
     * @return title String
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取内容
     * @return content String
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取创建时间
     * @return createTime LocalDateTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     * @return updateTime LocalDateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}