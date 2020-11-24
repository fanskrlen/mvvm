package com.lixun.provider.dao;

import com.lixun.api.pojo.SUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SUserMapper {

    @Select("select * from s_user")
    public List<SUser> findAll();

    public void add(SUser user);

    public void delete(Integer id);

    public void update(SUser user);
}
