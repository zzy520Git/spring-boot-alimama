package notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/11
 */
@SpringBootApplication
@EnableAspectJAutoProxy
//@EnableTransactionManagement
public class SpringBootApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
