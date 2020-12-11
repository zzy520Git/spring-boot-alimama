package notes.start.controller;

import lombok.extern.slf4j.Slf4j;
import notes.common.AliResult;
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
    public AliResult alive() {
        log.info("服务存活哦");
        AliResult<String> result = new AliResult<String>().setData("hello 中文");
        result.setCode("200");
        return result;
    }
}
