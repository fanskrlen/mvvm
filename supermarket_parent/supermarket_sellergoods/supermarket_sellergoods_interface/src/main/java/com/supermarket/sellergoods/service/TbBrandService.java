package com.supermarket.sellergoods.service;

import com.supermarket.pojo.TbBrand;
import com.supermarket.entity.PageResult;

import java.util.List;

public interface TbBrandService {

    public List<TbBrand> findAll();

    /**
     * 品牌分页
     * @param pageNum 当前页面
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);

    /**
     * 添加
     * @param brand
     */
    public void add(TbBrand brand);



    /**
     * 根据ID查询实体
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     * 将修改的结果保存在实体存过去  修改
     * @param brand
     */
    public void update(TbBrand brand);

    /**
     * 通过id批量删除品牌信息
     * @param ids
     */
    public void delete(List<Long> ids);

    /**
     * 可以根据品牌名查，也可以根据首字母查
     * @param brand 要查的数据
     * @param pageNum 当前页面
     * @param pageSize 页面记录数
     * @return
     */
    public PageResult getAllFindPage(TbBrand brand,int pageNum,int pageSize);
}
