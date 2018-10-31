package my.bauble.blog.mapper;

import my.bauble.blog.model.ArticleConnBoard;
import org.apache.ibatis.jdbc.SQL;

public class ArticleConnBoardSqlProvider {

    /**
     * 根据字段是否为空保存 
     * @param record ArticleConnBoard
     * @return String
     */
    public String insertSelective(ArticleConnBoard record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("article_conn_board");
        
        if (record.getArticleId() != null) {
            sql.VALUES("ARTICLE_ID", "#{articleId,jdbcType=INTEGER}");
        }
        
        if (record.getBoardId() != null) {
            sql.VALUES("BOARD_ID", "#{boardId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * 根据字段是否为空更新 
     * @param record ArticleConnBoard
     * @return String
     */
    public String updateByPrimaryKeySelective(ArticleConnBoard record) {
        SQL sql = new SQL();
        sql.UPDATE("article_conn_board");
        
        if (record.getBoardId() != null) {
            sql.SET("BOARD_ID = #{boardId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("ARTICLE_ID = #{articleId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}