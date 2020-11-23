package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbBrand)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:18
 */
public class TbBrand implements Serializable {
    private static final long serialVersionUID = 919659295187277760L;
    
    private Long id;
    /**
    * 品牌名称
    */
    private String name;
    /**
    * 品牌首字母
    */
    private String firstChar;


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

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

}