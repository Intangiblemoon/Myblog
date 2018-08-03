package my.bauble.blog.mapper;

import my.bauble.blog.model.BlogUser;
import org.apache.ibatis.jdbc.SQL;

public class BlogUserSqlProvider {

    /**
     * 根据字段是否为空保存 
     * @param record BlogUser
     * @return String
     */
    public String insertSelective(BlogUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("blog_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createtime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * 根据字段是否为空更新 
     * @param record BlogUser
     * @return String
     */
    public String updateByPrimaryKeySelective(BlogUser record) {
        SQL sql = new SQL();
        sql.UPDATE("blog_user");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createtime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}