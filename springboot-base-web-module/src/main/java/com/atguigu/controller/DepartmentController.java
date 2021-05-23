package com.atguigu.controller;

import com.atguigu.bean.Department;
import com.atguigu.bean.Employee;
import com.atguigu.mapper.DepartmentMapper;
import com.atguigu.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 说明：SpringBoot应用
 *
 * @author：李尚兴
 * @date：2021-05-19 22:03
 * @version：1.0
 */
@RestController
public class DepartmentController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/employee/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return this.employeeMapper.getEmpById(id);
    }

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id) {
        System.out.println("查询id为" + id + "的数据！");
        return this.departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department) {
        int insertCount = this.departmentMapper.insertDept(department);
        System.out.println("插入" + insertCount + "条数据！");
        return department;
    }

    @GetMapping("/query")
    @ResponseBody
    public Map<String, Object> query() {
        return this.jdbcTemplate.queryForList("SELECT * FROM department").get(0);
    }
}
