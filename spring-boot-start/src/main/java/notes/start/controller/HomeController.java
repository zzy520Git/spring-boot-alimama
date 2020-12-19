package notes.start.controller;

import lombok.extern.slf4j.Slf4j;
import notes.common.AliResult;
import notes.common.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/11
 */
@Slf4j
@RestController
@RequestMapping
public class HomeController implements ApplicationContextAware {
    private ApplicationContext context;

    @RequestMapping("alive")
    public AliResult alive() {
        log.info("服务存活哦");
        AliResult<String> result = new AliResult<String>().setData("hello 中文");
        result.setCode("200");
        return result;
    }

    @RequestMapping("userinfo")
    public AliResult<Student> getUserInfo(HttpServletRequest request,
                                          HttpServletResponse response) {
        /**
         * context
         * @see org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext
         */
        String[] bdNames = context.getBeanDefinitionNames();
        for (String bdName : bdNames) {
            System.out.println(bdName);
        }
        Student stu = new Student().setName("牛市").setAge(18);
        return AliResult.success(stu);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }
}
