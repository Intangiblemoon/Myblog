package my.bauble.blog.mapper;

import my.bauble.blog.model.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    /**
     * 根据字段是否为空保存 
     * @param record User
     * @return String
     */
    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("USER_NAME", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("PASSWORD", "#{password,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * 根据字段是否为空更新 
     * @param record User
     * @return String
     */
    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getUserName() != null) {
            sql.SET("USER_NAME = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("PASSWORD = #{password,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}