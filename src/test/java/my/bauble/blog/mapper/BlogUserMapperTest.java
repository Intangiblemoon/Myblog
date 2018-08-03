package my.bauble.blog.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author wensiao
 * @create 2018-08-03 14:45
 **/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BlogUserMapperTest {

    Logger logger = LoggerFactory.getLogger(BlogUserMapperTest.class);

    @Autowired
    private BlogUserMapper blogUserMapper;

    @Test
    public void getPass() {
        logger.info(blogUserMapper.getPass("first"));
    }
}