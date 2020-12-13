package notes.datasource.mysql.dao;

import notes.datasource.mysql.podo.TbBuyer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
//必需配这个注解，或者在Main上配MapperScan扫描
@Mapper
public interface TbBuyerDao {
    int deleteByPrimaryKey(Long id);

    int insert(TbBuyer record);

    int insertSelective(TbBuyer record);

    TbBuyer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbBuyer record);

    int updateByPrimaryKey(TbBuyer record);
}