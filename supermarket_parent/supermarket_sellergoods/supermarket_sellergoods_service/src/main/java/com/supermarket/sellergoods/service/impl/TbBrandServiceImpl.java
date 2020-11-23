package com.supermarket.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supermarket.mapper.TbBrandMapper;
import com.supermarket.pojo.TbBrand;
import com.supermarket.pojo.TbBrandExample;
import com.supermarket.entity.PageResult;
import com.supermarket.sellergoods.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.List;

@Service
public class TbBrandServiceImpl implements TbBrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;


    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);   //pageNum页码，pageSize每页显示数
        Page<TbBrand> page=(Page<TbBrand>)tbBrandMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void add(TbBrand brand) {
        tbBrandMapper.insert(brand);
    }

    @Override
    public TbBrand findOne(Long id) {
        return tbBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(TbBrand brand) {
        tbBrandMapper.updateByPrimaryKey(brand);
    }

    @Override
    public void delete(List<Long> ids) {
        Iterator<Long> id=ids.iterator();
        while (id.hasNext()){
            Long temp=id.next();
            tbBrandMapper.deleteByPrimaryKey(temp);
        }
//        for(Long id:ids){
//            tbBrandMapper.deleteByPrimaryKey(id);
//        }
    }

    @Override
    public PageResult getAllFindPage(TbBrand brand, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize); //分页
        TbBrandExample example=new TbBrandExample();
        TbBrandExample.Criteria criteria=example.createCriteria();
        if(brand!=null){
            //通过名字查询
            if (brand.getName()!=null && brand.getName().length()>0){
                criteria.andNameLike("%"+brand.getName()+"%");
            }
            //通过首字母查询
            if(brand.getFirstChar()!=null && brand.getFirstChar().length()>0){
                criteria.andFirstCharLike("%"+brand.getFirstChar()+"%");
            }
        }
        Page<TbBrand> page=(Page<TbBrand>)tbBrandMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());
    }
}
