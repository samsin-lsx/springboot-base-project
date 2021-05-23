package com.atguigu.mapper;

import com.atguigu.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * 说明：部门表增删改查接口方法
 * @author：李尚兴
 * @date：2021-05-20 0:37
 * @version：1.0
 */
// 如果因为接口上@Mapper注解过多造成冗余，还可以使用在SpringBoot主程序里面添加@MapperScan(value="com.atguigu.mapper")批量扫描
//@Mapper
public interface DepartmentMapper {
    @Options(useGeneratedKeys = true, keyProperty = "id") // 返回自增ID，指定主键
    @Insert("INSERT INTO department(department_name) VALUES(#{departmentName})")
    int insertDept(Department department);

    @Delete("DELETE FROM department WHERE id=#{id}")
    int deleteDept(Integer id);

    @Update("UPDATE department SET department_name=#{departmentName} WHERE id=#{id}")
    int updateDept(Department department);

    @Select("SELECT id, department_name FROM department WHERE id=#{id}")
    Department getDeptById(Integer id);
}
