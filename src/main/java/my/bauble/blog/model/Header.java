package my.bauble.blog.model;

/**
 *  
 * 表:header 
 * @author IM 
 * @date 2018-10-29 
 */
public class Header {
    /**
     * 
     * 表字段:ID
     */
    private Integer id;

    /**
     * 导航栏标题
     * 表字段:NAME
     */
    private String name;

    /**
     * 标题含义
     * 表字段:DETAIL
     */
    private String detail;

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
     * 获取导航栏标题
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置导航栏标题
     * @param name 导航栏标题
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取标题含义
     * @return detail String
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置标题含义
     * @param detail 标题含义
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}