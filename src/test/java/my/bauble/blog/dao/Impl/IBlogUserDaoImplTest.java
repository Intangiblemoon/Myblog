package my.bauble.blog.dao.Impl;

import my.bauble.blog.dao.IBlogUserDao;
import my.bauble.blog.model.BlogUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * @author wensiao
 * @create 2018-08-03 14:03
 **/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class IBlogUserDaoImplTest {

    private Logger logger = LoggerFactory.getLogger(IBlogUserDaoImplTest.class);
    @Autowired
    private IBlogUserDao iBlogUserDao ;

    @Test
    public void getPass(){
        logger.info(iBlogUserDao.getPass("first"));
    }

    @Test
    public void save() {
        BlogUser blogUser =new BlogUser();
        blogUser.setId(2);
        blogUser.setName("admin");
        blogUser.setPassword("12345");
        iBlogUserDao.save(blogUser);
    }

    @Test
    public void updatePassByName() {
        iBlogUserDao.updatePassByName("admin","112233");
    }
}