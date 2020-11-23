package com.supermarket.mapper;


import com.supermarket.pojo.TbTypeTemplate;
import com.supermarket.pojo.TbTypeTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTypeTemplateMapper {

    public int countByExample(TbTypeTemplateExample example);

    public int deleteByExample(TbTypeTemplateExample example);

    public int deleteByPrimaryKey(Long id);

    public int insert(TbTypeTemplate record);

    public int insertSelective(TbTypeTemplate record);

    public List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    public TbTypeTemplate selectByPrimaryKey(Long id);

    public int updateByExample(@Param("record")TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    public int updateByPrimaryKeySelective(TbTypeTemplate record);

    public int updateByPrimaryKey(TbTypeTemplate record);
}
