package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbSpecification)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbSpecification implements Serializable {
    private static final long serialVersionUID = -92048210262881519L;
    
    private Long id;
    /**
    * 说明书名称
    */
    private String specName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

}