package com.supermarket.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.supermarket.entity.PageResult;
import com.supermarket.mapper.TbTypeTemplateMapper;
import com.supermarket.pojo.TbBrand;
import com.supermarket.pojo.TbTypeTemplate;
import com.supermarket.pojo.TbTypeTemplateExample;
import com.supermarket.sellergoods.service.TbTypeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TbTypeTemplateServiceImpl implements TbTypeTemplateService {

    @Autowired
    private TbTypeTemplateMapper tbTypeTemplateMapper;

    @Override
    public List<TbTypeTemplate> findAll() {
        return tbTypeTemplateMapper.selectByExample(null);
    }

    @Override
    public TbTypeTemplate findOne(Long id) {
        return tbTypeTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(int pageSize, int pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        Page<TbTypeTemplate> page=(Page<TbTypeTemplate>)tbTypeTemplateMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public PageResult getAllFindPage(TbTypeTemplate tbTypeTemplate, int pageSize, int pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        TbTypeTemplateExample example=new TbTypeTemplateExample();
        TbTypeTemplateExample.Criteria criteria=example.createCriteria();
        if (tbTypeTemplate!=null){
            if (tbTypeTemplate.getName()!=null && tbTypeTemplate.getName().length()>0){
                criteria.andNameLike("%"+tbTypeTemplate.getName()+"%");
            }
        }
        Page<TbTypeTemplate> page=(Page<TbTypeTemplate>) tbTypeTemplateMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void delete(List<Long> ids) {
        for (Long id:ids) {
            tbTypeTemplateMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void add(TbTypeTemplate tbTypeTemplate) {
        tbTypeTemplateMapper.insert(tbTypeTemplate);
    }

    @Override
    public void update(TbTypeTemplate tbTypeTemplate) {
        tbTypeTemplateMapper.updateByPrimaryKey(tbTypeTemplate);
    }
}
