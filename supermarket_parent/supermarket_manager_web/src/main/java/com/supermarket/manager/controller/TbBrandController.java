package com.supermarket.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supermarket.pojo.TbBrand;
import com.supermarket.entity.PageResult;
import com.supermarket.entity.Result;
import com.supermarket.sellergoods.service.TbBrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RequestBody+@Controller=@RestController
 */
@RestController
@RequestMapping("/brand")
public class TbBrandController {

    @Reference
    private TbBrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page,int size){
        return brandService.findPage(page, size);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbBrand brand){
        try {
            brandService.add(brand);
            return new Result(true,"增加成功");
        }catch (Exception e){
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/findOne")
    public TbBrand findOne(Long id){
        return brandService.findOne(id);
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbBrand brand){
        try {
            brandService.update(brand);
            return new Result(true,"修改成功");
        }catch (Exception e){
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(@RequestBody List<Long> ids){
        try {
            brandService.delete(ids);
            return new Result(true,"品牌删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"品牌删除失败");
        }
    }

    /**
     * 分页查询数据
     * 获取JSON数据
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand brand,int page,int size){
        return brandService.getAllFindPage(brand,page,size);
    }
}
