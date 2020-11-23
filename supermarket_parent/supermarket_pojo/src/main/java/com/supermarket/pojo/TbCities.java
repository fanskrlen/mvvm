package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbCities)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbCities implements Serializable {
    private static final long serialVersionUID = -81848234904498545L;
    
    private Integer id;
    /**
    * 城市ID
    */
    private String cityid;
    /**
    * 城市名称
    */
    private String city;
    /**
    * 省份ID
    */
    private String provinceid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

}