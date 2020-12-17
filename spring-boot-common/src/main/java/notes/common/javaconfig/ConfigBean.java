package notes.common.javaconfig;

import notes.common.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/11
 */
@PropertySource({""})
@ComponentScan(value = {"notes.common"})
@Configuration
public class ConfigBean {

    @Bean
    public Student student() {
        return new Student();
    }
}
