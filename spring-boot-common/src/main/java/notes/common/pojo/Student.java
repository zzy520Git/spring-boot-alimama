package notes.common.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * Description:
 * lombok注解演示：
 * @Accessors(chain = true) 需要配合@Data或者@Setter使用
 * @Slf4j
 * @Data
 *
 * @author zhouzhongyi
 * @date 2020/12/11
 */
@Slf4j
@Data
@Accessors(chain = true)
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
}
