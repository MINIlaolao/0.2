package com.laoqixin.bean;

/**
 * @author Laoqixin
 */
public class Department {
    public Department(Integer departId, String departName) {
        super();
        this.departId = departId;
        this.departName = departName;
    }

    public Department() {
        super();
    }

    private Integer departId;

    private String departName;

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }
}