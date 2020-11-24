package com.lixun.api.service;

import com.lixun.api.pojo.SUser;

import java.util.List;

public interface IUserService {

    public List<SUser> findAll();

    public void add(SUser user);

    public void delete(Integer id);

    public void update(SUser user);
}
