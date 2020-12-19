package notes.common.javaconfig;

import notes.common.pojo.Student;
import org.springframework.beans.factory.annotation.Value;
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
@PropertySource({"classpath:source.properties"})
@ComponentScan(value = {"notes.common"})
@Configuration
public class ConfigBean {
    @Value("${zzy.source.username:ch_en}")
    private String appName;

    @Bean
    public Student student() {
        System.out.println(appName);
        return new Student();
    }
}
