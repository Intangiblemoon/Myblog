package my.bauble.blog.dao.Impl;

import my.bauble.blog.dao.IBlogTypeDao;
import my.bauble.blog.mapper.BlogTypeMapper;
import my.bauble.blog.model.BlogType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wensiao
 * @create 2018-08-03 15:34
 **/
public class IBlogTypeDaoImpl implements IBlogTypeDao {

    @Autowired
    private BlogTypeMapper blogTypeMapper;

    /**
     * 查询全部
     *
     * @return List<BlogType>
     */
    @Override
    public List<BlogType> findAll() {
        return blogTypeMapper.findAll();
    }

    /**
     * 保存
     *
     * @param blogType
     * @return int
     */
    @Override
    public int save(BlogType blogType) {
        return blogTypeMapper.insert(blogType);
    }

    /**
     * 根据id更新
     *
     * @param blogType
     * @return int
     */
    @Override
    public int updateById(BlogType blogType) {
        return blogTypeMapper.updateByPrimaryKey(blogType);
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return int
     */
    @Override
    public int deleteById(Integer id) {
        return blogTypeMapper.deleteByPrimaryKey(id);
    }
}
