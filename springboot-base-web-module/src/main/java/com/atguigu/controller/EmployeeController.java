package com.atguigu.controller;

import com.atguigu.dao.DepartmentDao;
import com.atguigu.dao.EmployeeDao;
import com.atguigu.entities.Department;
import com.atguigu.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private DepartmentDao departmentDao;

    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {
        System.out.println(id);
        this.employeeDao.delete(id);
        return "redirect:/emps";
    }

    /**
     * 修改员工
     * @param employee 员工对象
     * @return
     */
    @PutMapping("/emp")
    public String updateEmp(Employee employee) {
        this.employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 跳转到员工修改页面
     * @param id 员工id
     * @param model 封装值对象
     * @return
     */
    @GetMapping("/emp/{id}")
    public String toEditEmpPage(@PathVariable("id") Integer id, Model model) {
        Employee employee = this.employeeDao.get(id);
        model.addAttribute("emp", employee);
        Collection<Department> departments = this.departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    /**
     * 添加员工
     * @param employee 员工对象
     * @return
     */
    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        this.employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 跳转到员工添加页面
     * @return
     */
    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = this.departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    /**
     * 员工列表
     * @param model 封装属性对象
     * @return
     */
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = this.employeeDao.getAll();
        model.addAttribute("employees", employees);
        return "emp/list"; // 默认添加路径：classpath:/templates/
    }
}
