package notes.common.tools.demo;

import org.apache.commons.lang3.BooleanUtils;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/18
 */
public class BooleanUtilDemo {
    public static void main(String[] args) {
        bl();
    }

    public static void bl() {
        /**
         * @see org.apache.commons.lang3.BooleanUtils
         * TRUE,ON,Y,YES
         */
        boolean aTrue = BooleanUtils.toBoolean("true");
        boolean bTrue = BooleanUtils.toBoolean("yes");
        boolean cTrue = BooleanUtils.toBoolean("success");
        boolean dTrue = BooleanUtils.toBoolean("2");
        boolean eTrue = BooleanUtils.toBoolean("1");
        System.out.println(aTrue);
        System.out.println(bTrue);
        System.out.println(cTrue);
        System.out.println(dTrue);
        System.out.println(eTrue);
    }
}
