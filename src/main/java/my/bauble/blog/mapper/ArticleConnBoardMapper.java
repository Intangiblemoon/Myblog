package my.bauble.blog.mapper;

import my.bauble.blog.model.ArticleConnBoard;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ArticleConnBoardMapper {
    /**
     * 根据主键删除 
     * @param articleId Integer
     * @return int
     */
    @Delete({
        "delete from article_conn_board",
        "where ARTICLE_ID = #{articleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer articleId);

    /**
     * 保存
     * @param record ArticleConnBoard
     * @return int
     */
    @Insert({
        "insert into article_conn_board (ARTICLE_ID, BOARD_ID)",
        "values (#{articleId,jdbcType=INTEGER}, #{boardId,jdbcType=INTEGER})"
    })
    int insert(ArticleConnBoard record);

    /**
     * 根据字段是否为空保存 
     * @param record ArticleConnBoard
     * @return int
     */
    @InsertProvider(type=ArticleConnBoardSqlProvider.class, method="insertSelective")
    int insertSelective(ArticleConnBoard record);

    /**
     * 根据主键查询 
     * @param articleId Integer
     * @return ArticleConnBoard
     */
    @Select({
        "select",
        "ARTICLE_ID, BOARD_ID",
        "from article_conn_board",
        "where ARTICLE_ID = #{articleId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ARTICLE_ID", property="articleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BOARD_ID", property="boardId", jdbcType=JdbcType.INTEGER)
    })
    ArticleConnBoard selectByPrimaryKey(Integer articleId);

    /**
     * 根据字段是否为空更新 
     * @param record ArticleConnBoard
     * @return int
     */
    @UpdateProvider(type=ArticleConnBoardSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ArticleConnBoard record);

    /**
     * 根据主键更新所有字段 
     * @param record ArticleConnBoard
     * @return int
     */
    @Update({
        "update article_conn_board",
        "set BOARD_ID = #{boardId,jdbcType=INTEGER}",
        "where ARTICLE_ID = #{articleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ArticleConnBoard record);
}