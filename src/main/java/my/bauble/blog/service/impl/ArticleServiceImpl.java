package my.bauble.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import my.bauble.blog.mapper.ArticleMapper;
import my.bauble.blog.mapper.ArticleSelfMapper;
import my.bauble.blog.model.Article;
import my.bauble.blog.service.IArticleService;
import my.bauble.blog.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wensiao
 * @date 2018-10-31 15:37
 **/
@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleSelfMapper articleSelfMapper;

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 分页查询标题
     *
     * @param pageNum
     * @param pageSize
     * @return PageInfo<Article>
     */
    @Override
    public PageResult<Article> findTitle(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Article> articleList = articleSelfMapper.selectAll();
        PageInfo pageInfo = new PageInfo<>(articleList);
        return new PageResult<>(pageNum, pageSize, pageInfo.getTotal(), pageInfo.getPages(), articleList);
    }

    /**
     * 查询文章详情
     *
     * @param id
     * @return Article
     */
    @Override
    public Article find(int id) {
        return articleMapper.selectByPrimaryKey(id);
    }

}
