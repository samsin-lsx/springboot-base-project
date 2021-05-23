package com.atguigu.mapper;

import com.atguigu.bean.Employee;

/**
 * 说明：雇员接口
 * @author：李尚兴
 * @date：2021-05-21 21:53
 * @version：1.0
 */
// 可以在接口中使用@Mapper注解或MapperSacn注解，还可以在SpringBoot主程序中使用@MapperScan注解
public interface EmployeeMapper {
    /**
     * 根据id查询雇员信息
     * @param id 雇员id
     * @return 雇员对象
     */
    Employee getEmpById(Integer id);

    /**
     * 插入雇员数据
     * @param employee 包含雇员基本信息
     */
    void insertEmp(Employee employee);
}
