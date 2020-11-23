package com.supermarket.sellergoods.service;

import com.supermarket.entity.PageResult;
import com.supermarket.pojo.TbTypeTemplate;

import java.util.List;

public interface TbTypeTemplateService {

    public List<TbTypeTemplate> findAll();

    public TbTypeTemplate findOne(Long id);

    public PageResult findPage(int pageSize,int pageNum);

    public PageResult getAllFindPage(TbTypeTemplate tbTypeTemplate,int pageSize,int pageNum);

    public void delete(List<Long> ids);

    public void add(TbTypeTemplate tbTypeTemplate);

    public void update(TbTypeTemplate tbTypeTemplate);
}
