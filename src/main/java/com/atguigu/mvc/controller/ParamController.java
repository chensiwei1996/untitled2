package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * All rights Reserved, Designed By www.XXXX.com
 *
 * @author 陈思伟
 * @version V1.0.0
 * @projectName untitled2
 * @title ParamController
 * @package com.atguigu.mvc.controller
 * @description ${TODO}
 * @date 2022/6/27 12:43
 * @copyright 2022 www.XXXXX.com
 */
@Controller

public class ParamController {

    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }
    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String id = request.getParameter("id");
        System.out.println("username="+username+",id="+id);
        return "success";

    }
    @RequestMapping("/testParam")
    public String testParam(String username,String password,String hobby){
        System.out.println("username="+username + ",password="+password+",hobby="+hobby);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        System.out.println("2");
        System.out.println("3");

        return "success";

    }



}
