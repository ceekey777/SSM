package com.atguigu.ssm.controller;



import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


/**
 * @Description:
 * @params:
 * @return:
 * @Author: Ceekey  Email:147464823@qq.com
 * @Date: 2022/08/25/17:08
 * 查询所有员工信息-->/employee -->get
 * 根据id查询员工信息-->/employee/1 -->get
 * 跳转到添加页面-->/to/add -->get
 * 添加员工信息-->/employee -->post
 * 修改员工信息-->/employee -->put
 * 根据id删除员工信息-->/employee/1 -->delete
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/page/{pageNum}")
    public String getEmployeePage(Model model,@PathVariable("pageNum") Integer pageNum) {
        //获取分页的信息(pull)
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //将分页数据共享在请求域中
        model.addAttribute("page",page);
        //跳转到employee_list.html
        return "employee_list";
    }

    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        //查询所有的员工信息
        List<Employee> list = employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("list",list);
        //跳转到employee_list.html
        return "employee_list";
    }
}
