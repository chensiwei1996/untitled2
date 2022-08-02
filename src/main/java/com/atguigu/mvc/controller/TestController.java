package com.atguigu.mvc.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * All rights Reserved, Designed By www.XXXX.com
 *
 * @author 陈思伟
 * @version V1.0.0
 * @projectName untitled2
 * @title TestController
 * @package com.atguigu.mvc.controller
 * @description ${TODO}
 * @date 2022/6/26 0:16
 * @copyright 2022 www.XXXXX.com
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }



}
