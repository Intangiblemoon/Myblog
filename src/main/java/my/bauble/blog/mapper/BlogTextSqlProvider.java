package my.bauble.blog.mapper;

import my.bauble.blog.model.BlogText;
import org.apache.ibatis.jdbc.SQL;

public class BlogTextSqlProvider {

    /**
     * 根据字段是否为空保存 
     * @param record BlogText
     * @return String
     */
    public String insertSelective(BlogText record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("blog_text");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getText() != null) {
            sql.VALUES("text", "#{text,jdbcType=VARCHAR}");
        }
        
        if (record.getActor() != null) {
            sql.VALUES("actor", "#{actor,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createtime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTypeId() != null) {
            sql.VALUES("type_id", "#{typeId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * 根据字段是否为空更新 
     * @param record BlogText
     * @return String
     */
    public String updateByPrimaryKeySelective(BlogText record) {
        SQL sql = new SQL();
        sql.UPDATE("blog_text");
        
        if (record.getText() != null) {
            sql.SET("text = #{text,jdbcType=VARCHAR}");
        }
        
        if (record.getActor() != null) {
            sql.SET("actor = #{actor,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createtime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTypeId() != null) {
            sql.SET("type_id = #{typeId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}