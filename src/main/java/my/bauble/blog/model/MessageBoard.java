package my.bauble.blog.model;

import java.util.Date;

/**
 *  
 * 表:message_board 
 * @author IM 
 * @date 2018-10-29 
 */
public class MessageBoard {
    /**
     * 
     * 表字段:ID
     */
    private Integer id;

    /**
     * 留言人
     * 表字段:NAME
     */
    private String name;

    /**
     * 内容
     * 表字段:MESSAGE
     */
    private String message;

    /**
     * 创建时间
     * 表字段:CREATE
     */
    private Date create;

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
     * 获取留言人
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置留言人
     * @param name 留言人
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取内容
     * @return message String
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置内容
     * @param message 内容
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * 获取创建时间
     * @return create Date
     */
    public Date getCreate() {
        return create;
    }

    /**
     * 设置创建时间
     * @param create 创建时间
     */
    public void setCreate(Date create) {
        this.create = create;
    }
}