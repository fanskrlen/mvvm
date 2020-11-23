package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbSpecificationOption)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbSpecificationOption implements Serializable {
    private static final long serialVersionUID = -64038450424482469L;
    
    private Long id;
    /**
    * 选项名称
    */
    private String optionName;
    /**
    * 规格id
    */
    private Long specId;
    /**
    * 排序值
    */
    private Integer orders;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

}