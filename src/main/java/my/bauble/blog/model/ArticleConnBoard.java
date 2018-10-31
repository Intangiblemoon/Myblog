package my.bauble.blog.model;

/**
 *  
 * 表:article_conn_board 
 * @author IM 
 * @date 2018-10-29 
 */
public class ArticleConnBoard {
    /**
     * 文章id
     * 表字段:ARTICLE_ID
     */
    private Integer articleId;

    /**
     * 留言板id
     * 表字段:BOARD_ID
     */
    private Integer boardId;

    /**
     * 获取文章id
     * @return articleId Integer
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 设置文章id
     * @param articleId 文章id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取留言板id
     * @return boardId Integer
     */
    public Integer getBoardId() {
        return boardId;
    }

    /**
     * 设置留言板id
     * @param boardId 留言板id
     */
    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }
}