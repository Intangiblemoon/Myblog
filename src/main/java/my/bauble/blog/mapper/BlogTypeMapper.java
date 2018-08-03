package my.bauble.blog.mapper;

import my.bauble.blog.model.BlogType;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogTypeMapper {
    /**
     * 根据主键删除 
     * @param id Integer
     * @return int
     */
    @Delete({
        "delete from blog_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存
     * @param record BlogType
     * @return int
     */
    @Insert({
        "insert into blog_type (id, type_name, ",
        "createtime)",
        "values (#{id,jdbcType=INTEGER}, #{typeName,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP})"
    })
    int insert(BlogType record);

    /**
     * 根据字段是否为空保存 
     * @param record BlogType
     * @return int
     */
    @InsertProvider(type=BlogTypeSqlProvider.class, method="insertSelective")
    int insertSelective(BlogType record);

    /**
     * 根据主键查询 
     * @param id Integer
     * @return BlogType
     */
    @Select({
        "select",
        "id, type_name, createtime",
        "from blog_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    BlogType selectByPrimaryKey(Integer id);

    /**
     * 根据字段是否为空更新 
     * @param record BlogType
     * @return int
     */
    @UpdateProvider(type=BlogTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BlogType record);

    /**
     * 根据主键更新所有字段 
     * @param record BlogType
     * @return int
     */
    @Update({
        "update blog_type",
        "set type_name = #{typeName,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BlogType record);

    /**
     * 查询全部
     * @return List<BlogType>
     */
    @Select({
            "select",
            "id, type_name, createtime",
            "from blog_type"
    })
    List<BlogType> findAll();
}