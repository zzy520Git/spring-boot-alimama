package notes.common.tools.demo;

import java.util.Optional;
import java.util.Random;

/**
 * Description:
 * @see java.util.Optional
 *
 * orElseGet
 *
 * orElse
 *
 * map
 *
 * filter
 *
 * @author zhouzhongyi
 * @date 2020/12/16
 */
public class OptionalDemo {
    public static void main(String[] args) {
        op();
    }

    public static void op() {
        String atr = Optional.ofNullable(1).map(String::valueOf).get();
        System.out.println(atr);

        Object dd = Optional.ofNullable(null).orElseGet(Math::random);

        System.out.println(dd);
    }
}
