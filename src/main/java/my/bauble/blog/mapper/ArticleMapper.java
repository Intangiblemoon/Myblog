package my.bauble.blog.mapper;

import my.bauble.blog.model.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper {
    /**
     * 根据主键删除 
     * @param id Integer
     * @return int
     */
    @Delete({
        "delete from article",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存
     * @param record Article
     * @return int
     */
    @Insert({
        "insert into article (ID, TITLE, ",
        "CONTENT, CREATE_TIME, ",
        "UPDATE_TIME)",
        "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{createTime,jdbcType=DATE}, ",
        "#{updateTime,jdbcType=DATE})"
    })
    int insert(Article record);

    /**
     * 根据字段是否为空保存 
     * @param record Article
     * @return int
     */
    @InsertProvider(type=ArticleSqlProvider.class, method="insertSelective")
    int insertSelective(Article record);

    /**
     * 根据主键查询 
     * @param id Integer
     * @return Article
     */
    @Select({
        "select",
        "ID, TITLE, CONTENT, CREATE_TIME, UPDATE_TIME",
        "from article",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONTENT", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.DATE)
    })
    Article selectByPrimaryKey(Integer id);

    /**
     * 根据字段是否为空更新 
     * @param record Article
     * @return int
     */
    @UpdateProvider(type=ArticleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Article record);

    /**
     * 根据主键更新所有字段 
     * @param record Article
     * @return int
     */
    @Update({
        "update article",
        "set TITLE = #{title,jdbcType=VARCHAR},",
          "CONTENT = #{content,jdbcType=VARCHAR},",
          "CREATE_TIME = #{createTime,jdbcType=DATE},",
          "UPDATE_TIME = #{updateTime,jdbcType=DATE}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Article record);
}