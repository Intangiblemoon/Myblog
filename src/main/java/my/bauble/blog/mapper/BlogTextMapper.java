package my.bauble.blog.mapper;

import my.bauble.blog.model.BlogText;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface BlogTextMapper {
    /**
     * 根据主键删除 
     * @param id String
     * @return int
     */
    @Delete({
        "delete from blog_text",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * 保存
     * @param record BlogText
     * @return int
     */
    @Insert({
        "insert into blog_text (id, text, ",
        "actor, createtime, ",
        "type_id)",
        "values (#{id,jdbcType=VARCHAR}, #{text,jdbcType=VARCHAR}, ",
        "#{actor,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{typeId,jdbcType=INTEGER})"
    })
    int insert(BlogText record);

    /**
     * 根据字段是否为空保存 
     * @param record BlogText
     * @return int
     */
    @InsertProvider(type=BlogTextSqlProvider.class, method="insertSelective")
    int insertSelective(BlogText record);

    /**
     * 根据主键查询 
     * @param id String
     * @return BlogText
     */
    @Select({
        "select",
        "id, text, actor, createtime, type_id",
        "from blog_text",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="text", property="text", jdbcType=JdbcType.VARCHAR),
        @Result(column="actor", property="actor", jdbcType=JdbcType.VARCHAR),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.INTEGER)
    })
    BlogText selectByPrimaryKey(String id);

    /**
     * 根据字段是否为空更新 
     * @param record BlogText
     * @return int
     */
    @UpdateProvider(type=BlogTextSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BlogText record);

    /**
     * 根据主键更新所有字段 
     * @param record BlogText
     * @return int
     */
    @Update({
        "update blog_text",
        "set text = #{text,jdbcType=VARCHAR},",
          "actor = #{actor,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "type_id = #{typeId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(BlogText record);

    /**
     * 根据typeId查找
     * @param typeId
     * @return
     */
    @Select("select id, text, actor, createtime, type_id from blog_text where type_id = #{typeId,jdbcType=VARCHAR}")
    List<BlogText> findByTypeId(String typeId);

    /**
     * 查询全部
     * @return
     */
    @Select("select id, text, actor, createtime, type_id from blog_text")
    List<BlogText> findAll();
}