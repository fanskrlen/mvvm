package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbAreas)实体类
 *
 * @author makejava
 * @since 2020-09-23 18:34:29
 */
public class TbAreas implements Serializable {
    private static final long serialVersionUID = -39279506646412156L;
    
    private Long id;
    /**
    * 地区ID
    */
    private String areaid;
    /**
    * 名称
    */
    private String area;
    /**
    * 城市ID
    */
    private String cityid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

}