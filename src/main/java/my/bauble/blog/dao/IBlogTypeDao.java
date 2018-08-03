package my.bauble.blog.dao;

import my.bauble.blog.model.BlogType;

import java.util.List;

/**
 * @author wensiao
 * @create 2018-08-03 11:40
 **/
public interface IBlogTypeDao {

    /**
     * 查询全部
     * @return List<BlogType>
     */
    List<BlogType> findAll();

    /**
     * 保存
     * @param blogType
     * @return int
     */
    int save(BlogType blogType);

    /**
     * 根据id更新
     * @param blogType
     * @return int
     */
    int updateById(BlogType blogType);

    /**
     * 根据id删除
     * @param id
     * @return int
     */
    int deleteById(Integer id);
}
