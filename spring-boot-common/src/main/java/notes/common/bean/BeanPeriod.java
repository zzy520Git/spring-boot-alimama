package notes.common.bean;

import lombok.extern.slf4j.Slf4j;
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

    public BeanPeriod() {
        log.info("BeanPeriod进行构造函数");
    }

}
