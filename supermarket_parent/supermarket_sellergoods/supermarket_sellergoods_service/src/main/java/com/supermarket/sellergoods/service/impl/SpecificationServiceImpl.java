package com.supermarket.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.supermarket.entity.PageResult;
import com.supermarket.mapper.TbSpecificationMapper;
import com.supermarket.mapper.TbSpecificationOptionMapper;
import com.supermarket.pojo.TbSpecification;
import com.supermarket.pojo.TbSpecificationExample;
import com.supermarket.pojo.TbSpecificationOption;
import com.supermarket.pojo.TbSpecificationOptionExample;
import com.supermarket.pojogroup.Specification;
import com.supermarket.sellergoods.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private TbSpecificationMapper tbSpecificationMapper;

    @Autowired
    private TbSpecificationOptionMapper tbSpecificationOptionMapper;


    @Override
    public List<TbSpecification> findAll() {
        return tbSpecificationMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbSpecification> page=(Page<TbSpecification>)tbSpecificationMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void add(Specification specification) {
        //获取规格
        tbSpecificationMapper.insert(specification.getSpecification());

        //获取规格选项集合
        //foreach(类型 参数 : 集合)
        for (TbSpecificationOption option:specification.getSpecificationOptionList()){
//            option.setSpecId(tbSpecification.getId());
//            tbSpecificationOptionMapper.insert(option);
            option.setSpecId(specification.getSpecification().getId());
            tbSpecificationOptionMapper.insert(option);
        }

//        //迭代器
//        Iterator<TbSpecificationOption> option=tbSpecificationOptionList.iterator();
//        while (option.hasNext()){
//            TbSpecificationOption temp=option.next();//temp中间值
//            tbSpecificationOptionMapper.insert(temp);
//        }

    }

    @Override
    public void update(Specification specification) {
        //修改规格实体
        TbSpecification tbSpecification=specification.getSpecification();
        tbSpecificationMapper.updateByPrimaryKey(tbSpecification);

        //删除原来规格对应的规格选项
        TbSpecificationOptionExample example=new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria=example.createCriteria();
        criteria.andSpecIdEqualTo(tbSpecification.getId());
        tbSpecificationOptionMapper.deleteByExample(example);

        //获取规格选项集合
        List<TbSpecificationOption> specificationOptionList=specification.getSpecificationOptionList();
        for (TbSpecificationOption option:specificationOptionList){
            option.setSpecId(tbSpecification.getId());//设置规格ID
            tbSpecificationOptionMapper.insert(option);
        }

    }

    @Override
    public Specification findOne(Long id) {
        Specification specification=new Specification();
        //设置规格
        TbSpecification tbSpecification=tbSpecificationMapper.selectByPrimaryKey(id);
        specification.setSpecification(tbSpecification);

        //设置规格选项
        TbSpecificationOptionExample example=new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria=example.createCriteria();
        criteria.andSpecIdEqualTo(id);
        List<TbSpecificationOption> specificationOptionList=tbSpecificationOptionMapper.selectByExample(example);
        specification.setSpecificationOptionList(specificationOptionList);

        return specification;
    }

    //批量删除
    @Override
    public void delete(List<Long> ids) {
        Iterator<Long> id=ids.iterator();
        TbSpecificationOptionExample example=new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria=example.createCriteria();
        while (id.hasNext()){
            Long temp=id.next();
            tbSpecificationMapper.deleteByPrimaryKey(temp);
            criteria.andSpecIdEqualTo(temp);
        }
        tbSpecificationOptionMapper.deleteByExample(example);
    }

    @Override
    public PageResult findPage(TbSpecification specification, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        TbSpecificationExample example=new TbSpecificationExample();
        TbSpecificationExample.Criteria criteria=example.createCriteria();

        if (specification!=null){
            if (specification.getSpecName()!=null && specification.getSpecName().length()>0){
                criteria.andSpecNameLike("%"+specification.getSpecName()+"%");
            }
        }
        Page<TbSpecification> page=(Page<TbSpecification>) tbSpecificationMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public List<Map> selectOptionList() {
        return tbSpecificationMapper.selectOptionList();
    }
}
