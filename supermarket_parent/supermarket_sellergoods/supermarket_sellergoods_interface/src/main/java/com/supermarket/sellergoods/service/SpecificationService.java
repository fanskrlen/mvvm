package com.supermarket.sellergoods.service;

import com.supermarket.entity.PageResult;
import com.supermarket.pojo.TbSpecification;
import com.supermarket.pojogroup.Specification;

import java.util.List;
import java.util.Map;

public interface SpecificationService {

    public List<TbSpecification> findAll();

    public PageResult findPage(int pageNum,int pageSize);

    //添加到组合类
    public void add(Specification specification);

    //修改组合类数据
    public void update(Specification specification);

    //获取组合类id
    public Specification findOne(Long id);

    //根据id删除数据
    public void delete(List<Long> ids);

    //根据模板分页查询
    public PageResult findPage(TbSpecification specification,int pageNum,int pageSize);

    //查询选项列表
    public List<Map> selectOptionList();


}
