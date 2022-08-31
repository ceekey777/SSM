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
 * ��ѯ����Ա����Ϣ-->/employee -->get
 * ����id��ѯԱ����Ϣ-->/employee/1 -->get
 * ��ת�����ҳ��-->/to/add -->get
 * ���Ա����Ϣ-->/employee -->post
 * �޸�Ա����Ϣ-->/employee -->put
 * ����idɾ��Ա����Ϣ-->/employee/1 -->delete
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/page/{pageNum}")
    public String getEmployeePage(Model model,@PathVariable("pageNum") Integer pageNum) {
        //��ȡ��ҳ�ĵ���Ϣhot fix
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //����ҳ���ݹ�������������
        model.addAttribute("page",page);
        //��ת��employee_list.html
        return "employee_list";
    }

    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        //��ѯ���е�Ա����Ϣ
        List<Employee> list = employeeService.getAllEmployee();
        //��Ա����Ϣ���������й���
        model.addAttribute("list",list);
        //��ת��employee_list.html
        return "employee_list";
    }
}
