package com.supermarket.mapper;


import com.supermarket.pojo.TbSpecificationOption;
import com.supermarket.pojo.TbSpecificationOptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSpecificationOptionMapper {

    public int countByExample(TbSpecificationOptionExample example);

    public int deleteByExample(TbSpecificationOptionExample example);

    public int deleteByPrimaryKey(Long id);

    public int insert(TbSpecificationOption record);

    public int insertSelective(TbSpecificationOption record);

    public List<TbSpecificationOption> selectByExample(TbSpecificationOptionExample example);

    public TbSpecificationOption selectByPrimaryKey(Long id);

    public int updateByExample(@Param("record")TbSpecificationOption record, @Param("example") TbSpecificationOptionExample example);

    public int updateByPrimaryKeySelective(TbSpecificationOption record);

    public int updateByPrimaryKey(TbSpecificationOption record);
}
