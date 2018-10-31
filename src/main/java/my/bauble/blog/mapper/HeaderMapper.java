package my.bauble.blog.mapper;

import my.bauble.blog.model.Header;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface HeaderMapper {
    /**
     * 根据主键删除 
     * @param id Integer
     * @return int
     */
    @Delete({
        "delete from header",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存
     * @param record Header
     * @return int
     */
    @Insert({
        "insert into header (ID, NAME, ",
        "DETAIL)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{detail,jdbcType=VARCHAR})"
    })
    int insert(Header record);

    /**
     * 根据字段是否为空保存 
     * @param record Header
     * @return int
     */
    @InsertProvider(type=HeaderSqlProvider.class, method="insertSelective")
    int insertSelective(Header record);

    /**
     * 根据主键查询 
     * @param id Integer
     * @return Header
     */
    @Select({
        "select",
        "ID, NAME, DETAIL",
        "from header",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="DETAIL", property="detail", jdbcType=JdbcType.VARCHAR)
    })
    Header selectByPrimaryKey(Integer id);

    /**
     * 根据字段是否为空更新 
     * @param record Header
     * @return int
     */
    @UpdateProvider(type=HeaderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Header record);

    /**
     * 根据主键更新所有字段 
     * @param record Header
     * @return int
     */
    @Update({
        "update header",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "DETAIL = #{detail,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Header record);
}