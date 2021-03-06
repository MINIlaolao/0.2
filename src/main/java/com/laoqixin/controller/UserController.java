package com.laoqixin.controller;

import com.laoqixin.bean.User;
import com.laoqixin.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 *  @项目名：  renyuanguanlixitong0.2
 *  @包名：    com.laoqixin.controller
 *  @文件名:   UserController
 *  @author :   laoqixin
 *  @创建时间:  2018/12/12 23:25
 *  @描述：    TODO
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/signOn",method = RequestMethod.POST)
    public String signOn(Model model, String userId, String userPassword, HttpSession session)
    {
        User user = userService.findUser(userId,userPassword);

        if(user != null)
        {
            session.setAttribute("user",user);
            //改一下toSelectDepart
            return "redirect:/ToshowEmployeeList";

        }
        model.addAttribute("msg","账号或密码错误,请重新输入!");
        return "login";
    }
    @RequestMapping("/toSelectDepart")
    public  String toSelectDepart()
    {
        return "Department/selectDepartment";
    }


    @RequestMapping("/signOut")
    public String signOut(HttpSession session)
    {
        //清除session
        session.invalidate();
        //转向登录页面
        return "login";
    }
}
