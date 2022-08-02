package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * All rights Reserved, Designed By www.XXXX.com
 *
 * @author 陈思伟
 * @version V1.0.0
 * @projectName untitled2
 * @title RequestMappingController
 * @package com.atguigu.mvc.controller
 * @description ${TODO}
 * @date 2022/6/26 15:21
 * @copyright 2022 www.XXXXX.com
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping(
            value={"/testRequestMapping","test"},
            method={RequestMethod.GET,RequestMethod.POST}


            )
    public String success() {
        return "success";
    }
    @RequestMapping(value="/testParamsAndHeaders",params = {"username"})
    public String testParamsAndHeaders(){
        return "success";
    }
    @RequestMapping("/a?a/testAnt")
    public String testAnt(){
        return "success";
    }
    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id ,@PathVariable("username")String username){
        System.out.println("id="+id);
        System.out.println("username="+username);
        return "success";
    }


}
