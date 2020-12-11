package notes.common;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/11
 */
@Data
@Accessors(chain = true)
public class AliResult<T> implements Serializable {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 状态码
     */
    private String code;
    /**
     * 数据实体
     */
    private T data;

}
