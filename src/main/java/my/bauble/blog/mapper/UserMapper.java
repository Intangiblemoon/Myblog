package my.bauble.blog.mapper;

import my.bauble.blog.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    /**
     * 根据主键删除 
     * @param id Integer
     * @return int
     */
    @Delete({
        "delete from user",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存
     * @param record User
     * @return int
     */
    @Insert({
        "insert into user (ID, USER_NAME, ",
        "PASSWORD)",
        "values (#{id,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR})"
    })
    int insert(User record);

    /**
     * 根据字段是否为空保存 
     * @param record User
     * @return int
     */
    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    /**
     * 根据主键查询 
     * @param id Integer
     * @return User
     */
    @Select({
        "select",
        "ID, USER_NAME, PASSWORD",
        "from user",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    /**
     * 根据字段是否为空更新 
     * @param record User
     * @return int
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据主键更新所有字段 
     * @param record User
     * @return int
     */
    @Update({
        "update user",
        "set USER_NAME = #{userName,jdbcType=VARCHAR},",
          "PASSWORD = #{password,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}