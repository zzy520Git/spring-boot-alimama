package notes.common.source;

import notes.common.javaconfig.ConfigBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/17
 */
public class SpringSourceMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
        String[] bdNames = context.getBeanDefinitionNames();
        for (String bdName : bdNames) {
            System.out.println(bdName);
        }
        System.out.println(context.getBeanDefinitionCount());
    }
}
