package com.supermarket.manager.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.supermarket.entity.PageResult;
import com.supermarket.entity.Result;
import com.supermarket.pojo.TbTypeTemplate;
import com.supermarket.sellergoods.service.TbTypeTemplateService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //
@RequestMapping("/typeTemplate")
public class TbTypeTemplateController {

    @Reference
    private TbTypeTemplateService tbTypeTemplateService;

    @RequestMapping("/findAll")
    public List<TbTypeTemplate> findAll(){
        return tbTypeTemplateService.findAll();
    }

    @RequestMapping("/findOne")
    public TbTypeTemplate findOne(Long id){
        return tbTypeTemplateService.findOne(id);
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int pageSize,int pageNum){
        return tbTypeTemplateService.findPage(pageSize,pageNum);
    }

    @RequestMapping("/search")
    public PageResult search(@RequestBody TbTypeTemplate tbTypeTemplate, int pageSize, int pageNum){
        return tbTypeTemplateService.getAllFindPage(tbTypeTemplate,pageSize,pageNum);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbTypeTemplate tbTypeTemplate){
        try{
            tbTypeTemplateService.add(tbTypeTemplate);
            return new Result(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"添加失败");
        }

    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbTypeTemplate tbTypeTemplate){
        tbTypeTemplateService.update(tbTypeTemplate);
    }

    @RequestMapping("/delete")
    public Result delete(@RequestBody List<Long> ids){
        tbTypeTemplateService.delete(ids);
    }

}
