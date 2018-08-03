package my.bauble.blog.mapper;

import my.bauble.blog.model.BlogType;
import org.apache.ibatis.jdbc.SQL;

public class BlogTypeSqlProvider {

    /**
     * 根据字段是否为空保存 
     * @param record BlogType
     * @return String
     */
    public String insertSelective(BlogType record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("blog_type");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getTypeName() != null) {
            sql.VALUES("type_name", "#{typeName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createtime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * 根据字段是否为空更新 
     * @param record BlogType
     * @return String
     */
    public String updateByPrimaryKeySelective(BlogType record) {
        SQL sql = new SQL();
        sql.UPDATE("blog_type");
        
        if (record.getTypeName() != null) {
            sql.SET("type_name = #{typeName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createtime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}