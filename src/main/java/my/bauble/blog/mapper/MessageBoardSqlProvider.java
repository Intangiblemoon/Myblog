package my.bauble.blog.mapper;

import my.bauble.blog.model.MessageBoard;
import org.apache.ibatis.jdbc.SQL;

public class MessageBoardSqlProvider {

    /**
     * 根据字段是否为空保存 
     * @param record MessageBoard
     * @return String
     */
    public String insertSelective(MessageBoard record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("message_board");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getMessage() != null) {
            sql.VALUES("MESSAGE", "#{message,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate() != null) {
            sql.VALUES("CREATE", "#{create,jdbcType=DATE}");
        }
        
        return sql.toString();
    }

    /**
     * 根据字段是否为空更新 
     * @param record MessageBoard
     * @return String
     */
    public String updateByPrimaryKeySelective(MessageBoard record) {
        SQL sql = new SQL();
        sql.UPDATE("message_board");
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getMessage() != null) {
            sql.SET("MESSAGE = #{message,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate() != null) {
            sql.SET("CREATE = #{create,jdbcType=DATE}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}