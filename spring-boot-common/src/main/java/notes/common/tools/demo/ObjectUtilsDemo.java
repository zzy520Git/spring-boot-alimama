package notes.common.tools.demo;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * @see org.apache.commons.lang3.ObjectUtils
 *
 * defaultIfNull
 * 如果为空就去默认值
 *
 * @author zhouzhongyi
 * @date 2020/12/16
 */
public class ObjectUtilsDemo {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "US");
        String def = ObjectUtils.defaultIfNull(map.get("b"), "EN");
        System.out.println(def);
    }
}
