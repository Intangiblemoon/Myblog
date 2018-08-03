package my.bauble.blog.dao;

import my.bauble.blog.model.BlogText;

import java.util.List;

/**
 * @author wensiao
 * @create 2018-08-03 11:40
 **/
public interface IBlogTextDao {

    /**
     * 按id查询
     * @param id
     * @return BlogText
     */
    BlogText findById(String id);

    /**
     * 按typeId查询
     * @param typeId
     * @return List<BlogText>
     */
    List<BlogText> findByTypeId(String typeId);

    /**
     * 查询全部
     * @return List<BlogText>
     */
    List<BlogText> findAll();

    /**
     * 保存
     * @param blogText
     * @return int
     */
    int save(BlogText blogText);

    /**
     * 根据id更新
     * @param id
     * @return int
     */
    int updateById(BlogText blogText);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById(String id);

}
