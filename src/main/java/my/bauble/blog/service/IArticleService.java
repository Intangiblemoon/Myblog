package my.bauble.blog.service;



import my.bauble.blog.model.Article;
import my.bauble.blog.utils.PageResult;


/**
 * @author wensiao
 * @date 2018-10-29 11:19
 **/
public interface IArticleService {

    /**
     * 分页查询标题
     * @param pageNum
     * @param pageSize
     * @return PageInfo<Article>
     */
    PageResult<Article> findTitle(int pageNum, int pageSize);

    /**
     * 查询文章详情
     * @param id
     * @return Article
     */
    Article find(int id);
}
