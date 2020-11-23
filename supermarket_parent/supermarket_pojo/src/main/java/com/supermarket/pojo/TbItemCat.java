package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbItemCat)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbItemCat implements Serializable {
    private static final long serialVersionUID = 157609659638053101L;
    
    private Long id;
    /**
    * 父类目录id=0时，是一级目录
    */
    private Long parentId;
    /**
    * 类目名称
    */
    private String name;
    /**
    * 类型id
    */
    private Long typeId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

}