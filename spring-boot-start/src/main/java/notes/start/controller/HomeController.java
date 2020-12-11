package notes.start.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/11
 */
@Slf4j
@RestController
@RequestMapping
public class HomeController {

    @RequestMapping("alive")
    public Object alive() {
        log.info("服务存活哦");
        return "hello 中文";
    }
}
