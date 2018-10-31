package my.bauble.blog.mapper;

import my.bauble.blog.model.Header;
import org.apache.ibatis.jdbc.SQL;

public class HeaderSqlProvider {

    /**
     * 根据字段是否为空保存 
     * @param record Header
     * @return String
     */
    public String insertSelective(Header record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("header");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDetail() != null) {
            sql.VALUES("DETAIL", "#{detail,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * 根据字段是否为空更新 
     * @param record Header
     * @return String
     */
    public String updateByPrimaryKeySelective(Header record) {
        SQL sql = new SQL();
        sql.UPDATE("header");
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDetail() != null) {
            sql.SET("DETAIL = #{detail,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}