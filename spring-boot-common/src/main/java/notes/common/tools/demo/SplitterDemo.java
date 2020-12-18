package notes.common.tools.demo;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/18
 */
public class SplitterDemo {
    public static void main(String[] args) {
        final String appIds = "31 , jello, jk123, 武汉 ";
        sp(appIds);
    }

    public static void sp(String appIds) {
        /**
         * @see com.google.common.base.Splitter
         */
        Splitter.on(",")
                //返回一个不可更改的list
                .splitToList(appIds)
                .stream()
                .map(String::trim)
                .filter(StringUtils::isNotBlank)
                .forEach(System.out::println);
    }
}
