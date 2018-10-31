package my.bauble.blog.controller;

import my.bauble.blog.model.Article;
import my.bauble.blog.service.IArticleService;
import my.bauble.blog.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wensiao
 * @date 2018-10-29 11:41
 **/
@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    PageResult<Article> queryTitile(int pageNum, int pageSize) {
        return articleService.findTitle(pageNum, pageSize);
    }
}
