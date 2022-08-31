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
     * ��ѯ����Ա����Ϣ
     * @return
     */
    List<Employee> getAllEmployee();



    /**
     * ��ȡ����Ա���ķ�ҳ��Ϣ
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
