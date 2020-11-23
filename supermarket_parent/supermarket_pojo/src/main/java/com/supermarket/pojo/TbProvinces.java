package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbProvinces)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbProvinces implements Serializable {
    private static final long serialVersionUID = -38420172819456034L;
    
    private Integer id;
    /**
    * 省份id
    */
    private String provinceid;
    /**
    * 省份名称
    */
    private String province;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}