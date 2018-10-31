package my.bauble.blog.model;

/**
 *  
 * 表:user 
 * @author IM 
 * @date 2018-10-29 
 */
public class User {
    /**
     * 
     * 表字段:ID
     */
    private Integer id;

    /**
     * 用户名
     * 表字段:USER_NAME
     */
    private String userName;

    /**
     * 密码
     * 表字段:PASSWORD
     */
    private String password;

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
     * 获取用户名
     * @return userName String
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取密码
     * @return password String
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}