package my.bauble.blog.dao;

import my.bauble.blog.model.BlogUser;


/**
 * @author wensiao
 * @create 2018-08-03 11:41
 **/
public interface IBlogUserDao {

    /**
     * 获得密码
     * @param name
     * @return BlogUser
     */
    String getPass(String name);

    /**
     * 保存
     * @param blogUser
     * @return int
     */
    int save(BlogUser blogUser);

    /**
     * 根据名字更新密码
     * @param name
     * @param password
     * @return int
     */
    int updatePassByName(String name,String password);
}
