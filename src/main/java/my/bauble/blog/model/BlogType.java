package my.bauble.blog.model;

import java.util.Date;

/**
 *  
 * 表:blog_type 
 * @author IM 
 * @date 2018-08-03 
 */
public class BlogType {
    /**
     * 
     * 表字段:id
     */
    private Integer id;

    /**
     * 
     * 表字段:type_name
     */
    private String typeName;

    /**
     * 
     * 表字段:createtime
     */
    private Date createtime;

    public BlogType() {
    }

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
     * 获取
     * @return typeName String
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置
     * @param typeName 
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BlogType{");
        sb.append("id=").append(id);
        sb.append(", typeName='").append(typeName).append('\'');
        sb.append(", createtime=").append(createtime);
        sb.append('}');
        return sb.toString();
    }
}