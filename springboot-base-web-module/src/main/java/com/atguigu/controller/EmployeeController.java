package com.atguigu.controller;

import com.atguigu.dao.EmployeeDao;
import com.atguigu.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * 说明：员工管理控制器
 * @author：李尚兴
 * @date：2021-02-26 16:12
 * @version：1.0
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = this.employeeDao.getAll();
        model.addAttribute("employees", employees);
        return "emp/list"; // classpath:/templates/
    }
}
