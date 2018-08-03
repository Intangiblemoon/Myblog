package my.bauble.blog.model;

import java.util.Date;

/**
 *  
 * 表:blog_text 
 * @author IM 
 * @date 2018-08-03 
 */
public class BlogText {
    /**
     * 
     * 表字段:id
     */
    private String id;

    /**
     * 
     * 表字段:text
     */
    private String text;

    /**
     * 
     * 表字段:actor
     */
    private String actor;

    /**
     * 
     * 表字段:createtime
     */
    private Date createtime;

    /**
     * 
     * 表字段:type_id
     */
    private Integer typeId;

    public BlogText() {
    }

    /**
     * 获取
     * @return id String
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取
     * @return text String
     */
    public String getText() {
        return text;
    }

    /**
     * 设置
     * @param text 
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * 获取
     * @return actor String
     */
    public String getActor() {
        return actor;
    }

    /**
     * 设置
     * @param actor 
     */
    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    /**
     * 获取
     * @return createtime Date
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置
     * @param createtime 
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取
     * @return typeId Integer
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置
     * @param typeId 
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BlogText{");
        sb.append("id='").append(id).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", actor='").append(actor).append('\'');
        sb.append(", createtime=").append(createtime);
        sb.append(", typeId=").append(typeId);
        sb.append('}');
        return sb.toString();
    }
}