package my.bauble.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wensiao
 * @date 2018-11-28 19:59
 **/
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") //允许任何域名使用
                .allowedHeaders("*") //允许任何头
                .allowedMethods("*") //允许任何方法  或者 "GET", "POST", "DELETE", "PUT" 等
                .allowCredentials(true) //允许证书
                .maxAge(3600L); //最大时间
    }
}