package com.atguigu.bean;

/**
 * 说明：部门表
 * @author：李尚兴
 * @date：2021-05-20 0:32
 * @version：1.0
 */
public class Department {
    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
