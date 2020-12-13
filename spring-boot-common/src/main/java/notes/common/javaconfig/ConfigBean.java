package notes.common.javaconfig;

import notes.common.bean.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/11
 */
@Configuration
public class ConfigBean {

    @Bean
    public Test test() {
        return new Test();
    }
}
