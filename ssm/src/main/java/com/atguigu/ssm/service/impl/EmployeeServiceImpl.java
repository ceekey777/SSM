package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.EmployeeMapper;
import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @params:
 * @return:
 * @Author: Ceekey  Email:147464823@qq.com
 * @Date: 2022/08/25/17:33
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {

        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //������ҳ����
        PageHelper.startPage(pageNum,4);
        //��ѯ���е�Ա����Ϣ
        List<Employee> list = employeeMapper.getAllEmployee();
        //��ȡ��ҳ�������(����,������ҳ��ҳ��)
        PageInfo<Employee> page = new PageInfo<>(list,5);
        return page;
    }
}
