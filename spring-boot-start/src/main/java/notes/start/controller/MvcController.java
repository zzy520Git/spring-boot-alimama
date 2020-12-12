package notes.start.controller;

import notes.common.AliResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/12
 */
@Controller
@RequestMapping("/mvc")
public class MvcController {

    @ResponseBody
    @RequestMapping("/now")
    public AliResult getNowDate() {
        return AliResult.success(new Date());
    }
}
