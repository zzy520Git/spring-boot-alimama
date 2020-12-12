package notes.start.javaconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description:
 * 扩展 spring-mvc的功能，而不是全面接管
 *
 * @author zhouzhongyi
 * @date 2020/12/12
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
}
