package my.bauble.blog.mapper;

import my.bauble.blog.model.Article;
import org.apache.ibatis.jdbc.SQL;

public class ArticleSqlProvider {

    /**
     * 根据字段是否为空保存 
     * @param record Article
     * @return String
     */
    public String insertSelective(Article record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("article");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("TITLE", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("CONTENT", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("CREATE_TIME", "#{createTime,jdbcType=DATE}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("UPDATE_TIME", "#{updateTime,jdbcType=DATE}");
        }
        
        return sql.toString();
    }

    /**
     * 根据字段是否为空更新 
     * @param record Article
     * @return String
     */
    public String updateByPrimaryKeySelective(Article record) {
        SQL sql = new SQL();
        sql.UPDATE("article");
        
        if (record.getTitle() != null) {
            sql.SET("TITLE = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("CONTENT = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("CREATE_TIME = #{createTime,jdbcType=DATE}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("UPDATE_TIME = #{updateTime,jdbcType=DATE}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}