package com.laoqixin.controller;

import com.laoqixin.dao.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *  @项目名：  renyuanguanlixitong0.2
 *  @包名：    com.laoqixin.controller
 *  @文件名:   EmployeeController
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/13 9:33
 *  @描述：    TODO
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;
    @RequestMapping("/showEmployeeList")
    public String showEmployeeList()
    {
        return null;
    }
}
