import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/12
 */
@SpringBootTest
public class SpringBootAppTest {

    @Test
    public void contextLoad() {
        System.out.println("hello");
    }
}
