package my.bauble.blog.model;

import java.util.Date;

/**
 *  
 * 表:blog_user 
 * @author IM 
 * @date 2018-08-03 
 */
public class BlogUser {
    /**
     * 
     * 表字段:id
     */
    private Integer id;

    /**
     * 
     * 表字段:name
     */
    private String name;

    /**
     * 
     * 表字段:password
     */
    private String password;

    /**
     * 
     * 表字段:createtime
     */
    private Date createtime;

    public BlogUser() {
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
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取
     * @return password String
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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
        final StringBuffer sb = new StringBuffer("BlogUser{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", createtime=").append(createtime);
        sb.append('}');
        return sb.toString();
    }
}