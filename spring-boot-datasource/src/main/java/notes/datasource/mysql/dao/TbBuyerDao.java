package notes.datasource.mysql.dao;

import notes.datasource.mysql.podo.TbBuyer;

public interface TbBuyerDao {
    int deleteByPrimaryKey(Long id);

    int insert(TbBuyer record);

    int insertSelective(TbBuyer record);

    TbBuyer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbBuyer record);

    int updateByPrimaryKey(TbBuyer record);
}