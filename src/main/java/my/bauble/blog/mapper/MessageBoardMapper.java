package my.bauble.blog.mapper;

import my.bauble.blog.model.MessageBoard;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MessageBoardMapper {
    /**
     * 根据主键删除 
     * @param id Integer
     * @return int
     */
    @Delete({
        "delete from message_board",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存
     * @param record MessageBoard
     * @return int
     */
    @Insert({
        "insert into message_board (ID, NAME, ",
        "MESSAGE, CREATE)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{message,jdbcType=VARCHAR}, #{create,jdbcType=DATE})"
    })
    int insert(MessageBoard record);

    /**
     * 根据字段是否为空保存 
     * @param record MessageBoard
     * @return int
     */
    @InsertProvider(type=MessageBoardSqlProvider.class, method="insertSelective")
    int insertSelective(MessageBoard record);

    /**
     * 根据主键查询 
     * @param id Integer
     * @return MessageBoard
     */
    @Select({
        "select",
        "ID, NAME, MESSAGE, CREATE",
        "from message_board",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="MESSAGE", property="message", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE", property="create", jdbcType=JdbcType.DATE)
    })
    MessageBoard selectByPrimaryKey(Integer id);

    /**
     * 根据字段是否为空更新 
     * @param record MessageBoard
     * @return int
     */
    @UpdateProvider(type=MessageBoardSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MessageBoard record);

    /**
     * 根据主键更新所有字段 
     * @param record MessageBoard
     * @return int
     */
    @Update({
        "update message_board",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "MESSAGE = #{message,jdbcType=VARCHAR},",
          "CREATE = #{create,jdbcType=DATE}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MessageBoard record);
}