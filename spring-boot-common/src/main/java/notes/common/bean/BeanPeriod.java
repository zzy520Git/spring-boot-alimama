package notes.common.bean;

import lombok.extern.slf4j.Slf4j;
import notes.common.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/13
 */
@Slf4j
@Component
public class BeanPeriod {
    @Autowired
    private Student student;

    public BeanPeriod() {
        log.info("BeanPeriod进行构造函数");
    }

}
