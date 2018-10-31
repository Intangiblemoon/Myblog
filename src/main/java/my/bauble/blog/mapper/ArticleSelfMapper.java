package my.bauble.blog.mapper;

import my.bauble.blog.model.Article;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wensiao
 * @date 2018-10-31 15:39
 **/
@Repository
public interface ArticleSelfMapper {

    @Select({
            "select",
            "ID, TITLE, CONTENT, CREATE_TIME, UPDATE_TIME",
            "from article"
    })
    @Results({
            @Result(column="ID", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
            @Result(column="CONTENT", property="content", jdbcType=JdbcType.VARCHAR),
            @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.DATE),
            @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.DATE)
    })
    List<Article> selectAll();
}
