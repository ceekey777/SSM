package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description:
 * @params:
 * @return:
 * @Author: Ceekey  Email:147464823@qq.com
 * @Date: 2022/08/25/17:33
 */
public interface EmployeeService {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();



    /**
     * 获取所有员工的分页信息
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
