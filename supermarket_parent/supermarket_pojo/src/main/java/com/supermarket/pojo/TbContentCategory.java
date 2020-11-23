package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbContentCategory)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbContentCategory implements Serializable {
    private static final long serialVersionUID = -80442517548010918L;
    
    private Long id;
    /**
    * 分类名称
    */
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}