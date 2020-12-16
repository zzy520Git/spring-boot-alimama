package notes.common.tools.demo;

import org.apache.commons.lang3.StringUtils;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/16
 */
public class StringUtilsDemo {
    public static void main(String[] args) {
        sp();
    }

    public static void sp() {
        String spStr = "hello,china,123";
        String prefix = StringUtils.substringBefore(spStr, ",");
        System.out.println(prefix);
        System.out.println(StringUtils.substringAfter(spStr, ","));
        System.out.println(StringUtils.substringAfterLast(spStr, ","));
    }
}
