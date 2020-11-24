package com.lixun.consumer;

import com.lixun.api.pojo.SUser;
import com.lixun.api.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class Consumer {

    @Reference(version = "1.0")
    private IUserService userService;

    @RequestMapping("/findAll")
    public List<SUser> findAll(){
        return userService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody SUser user){
        userService.add(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        userService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody SUser user){
        userService.update(user);
    }

}
