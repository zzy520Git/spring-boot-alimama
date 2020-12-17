package notes.common.source.service;

import notes.common.AliResult;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/17
 */
@Service
public class CglibAopService {
    /**
     * 测试CGLIB代理
     * @param name
     * @return
     */
    public AliResult<String> weaveAop(String name) {
        return AliResult.success(name);
    }
}
