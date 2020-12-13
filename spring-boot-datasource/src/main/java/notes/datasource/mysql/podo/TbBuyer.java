package notes.datasource.mysql.podo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * tb_buyer
 * @author 
 */
@Data
public class TbBuyer implements Serializable {
    /**
     * 主键

     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别：0-男，1-女
     */
    private Boolean sex;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 年收入：人民币
     */
    private BigDecimal money;

    /**
     * 有效：0-无效，1-有效
     */
    private Boolean yn;

    private static final long serialVersionUID = 1L;
}