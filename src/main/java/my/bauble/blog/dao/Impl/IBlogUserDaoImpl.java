package my.bauble.blog.dao.Impl;

import my.bauble.blog.dao.IBlogUserDao;
import my.bauble.blog.mapper.BlogUserMapper;
import my.bauble.blog.model.BlogUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wensiao
 * @create 2018-08-03 13:57
 **/
@Component
public class IBlogUserDaoImpl implements IBlogUserDao {

    @Autowired
    private BlogUserMapper blogUserMapper;

    /**
     * 获得密码
     *
     * @param name
     * @return BlogUser
     */
    @Override
    public String getPass(String name) {
        return blogUserMapper.getPass(name);
    }

    /**
     * 保存
     *
     * @param blogUser
     * @return int
     */
    @Override
    public int save(BlogUser blogUser) {
        blogUserMapper.insert(blogUser);
        return 0;
    }

    /**
     * 根据名字更新密码
     *
     * @param name
     * @return int
     */
    @Override
    public int updatePassByName(String name,String password) {
        return blogUserMapper.updatePassByName(name,password);
    }
}
