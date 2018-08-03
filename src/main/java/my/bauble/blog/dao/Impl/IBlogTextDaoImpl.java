package my.bauble.blog.dao.Impl;

import my.bauble.blog.dao.IBlogTextDao;
import my.bauble.blog.mapper.BlogTextMapper;
import my.bauble.blog.model.BlogText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wensiao
 * @create 2018-08-03 15:19
 **/
@Component
public class IBlogTextDaoImpl implements IBlogTextDao {

    @Autowired
    private BlogTextMapper blogTextMapper;

    /**
     * 按id查询
     *
     * @param id
     * @return BlogText
     */
    @Override
    public BlogText findById(String id) {
        return blogTextMapper.selectByPrimaryKey(id);
    }

    /**
     * 按typeId查询
     *
     * @param typeId
     * @return List<BlogText>
     */
    @Override
    public List<BlogText> findByTypeId(String typeId) {
        return blogTextMapper.findByTypeId(typeId);
    }

    /**
     * 查询全部
     *
     * @return List<BlogText>
     */
    @Override
    public List<BlogText> findAll() {
        return blogTextMapper.findAll();
    }

    /**
     * 保存
     *
     * @param blogText
     * @return int
     */
    @Override
    public int save(BlogText blogText) {
        return blogTextMapper.insert(blogText);
    }

    /**
     * 根据id更新
     *
     * @param blogText
     * @return int
     */
    @Override
    public int updateById(BlogText blogText) {
        return blogTextMapper.updateByPrimaryKey(blogText);
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(String id) {
        return blogTextMapper.deleteByPrimaryKey(id);
    }
}
