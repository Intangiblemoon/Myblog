package my.bauble.blog.mapper;

import my.bauble.blog.model.BlogUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogUserMapper {
    /**
     * 根据主键删除 
     * @param id Integer
     * @return int
     */
    @Delete({
        "delete from blog_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存
     * @param record BlogUser
     * @return int
     */
    @Insert({
        "insert into blog_user (id, name, ",
        "password, createtime)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP})"
    })
    int insert(BlogUser record);

    /**
     * 根据字段是否为空保存 
     * @param record BlogUser
     * @return int
     */
    @InsertProvider(type=BlogUserSqlProvider.class, method="insertSelective")
    int insertSelective(BlogUser record);

    /**
     * 根据主键查询 
     * @param id Integer
     * @return BlogUser
     */
    @Select({
        "select",
        "id, name, password, createtime",
        "from blog_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    BlogUser selectByPrimaryKey(Integer id);

    /**
     * 根据字段是否为空更新 
     * @param record BlogUser
     * @return int
     */
    @UpdateProvider(type=BlogUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BlogUser record);

    /**
     * 根据主键更新所有字段 
     * @param record BlogUser
     * @return int
     */
    @Update({
        "update blog_user",
        "set name = #{name,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BlogUser record);

    /**
     * 获得密码
     * @param name
     * @return
     */
    @Select("select password from blog_user where name = #{name,jdbcType=VARCHAR}")
    String getPass(String name);

    /**
     * 根据名字修改密码
     * @param name
     * @param password
     * @return
     */
    @Update("update blog_user set password = #{password,jdbcType=VARCHAR} where name = #{name,jdbcType=VARCHAR}")
    int updatePassByName(@Param("name") String name, @Param("password") String password);
}