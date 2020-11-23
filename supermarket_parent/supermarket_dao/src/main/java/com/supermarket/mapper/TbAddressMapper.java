package com.supermarket.mapper;

import com.supermarket.pojo.TbAddress;
import com.supermarket.pojo.TbAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAddressMapper {

    public int countByExample(TbAddressExample example);

    public int deleteByExample(TbAddressExample example);

    public int deleteByPrimaryKey(Long id);

    public int insert(TbAddress record);

    public int insertSelective(TbAddress record);

    public List<TbAddress> selectByExample(TbAddressExample example);

    public TbAddress selectByPrimaryKey(Long id);

    public int updateByExample(@Param("record")TbAddress record,@Param("example") TbAddressExample example);

    public int updateByPrimaryKeySelective(TbAddress record);

    public int updateByPrimaryKey(TbAddress record);
}
