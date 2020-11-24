package com.lixun.provider.service;

import com.lixun.api.pojo.SUser;
import com.lixun.api.service.IUserService;
import com.lixun.provider.dao.SUserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0")
public class UserServiceImpl implements IUserService {

    @Autowired
    private SUserMapper userMapper;

    @Override
    public List<SUser> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void add(SUser user) {
        userMapper.add(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public void update(SUser user) {
        userMapper.update(user);
    }
}
