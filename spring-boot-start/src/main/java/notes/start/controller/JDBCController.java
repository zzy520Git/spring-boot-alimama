package notes.start.controller;

import notes.common.AliResult;
import notes.datasource.mysql.dao.TbBuyerDao;
import notes.datasource.mysql.podo.TbBuyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/13
 */
@RestController
@RequestMapping("/jdbc")
public class JDBCController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TbBuyerDao tbBuyerDao;


    @RequestMapping("/buyers")
    public AliResult buyers() {
        List<Map<String, Object>> buyers = jdbcTemplate.queryForList("select * from tb_buyer");
        return AliResult.success(buyers);
    }

    @RequestMapping("/buyerlist")
    public AliResult buyerList() {
        TbBuyer tbBuyer = tbBuyerDao.selectByPrimaryKey(1L);
        return AliResult.success(tbBuyer);
    }
}
