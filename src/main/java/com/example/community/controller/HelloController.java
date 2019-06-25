package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shenyi
 * @version 1.0
 * @date 2019/6/24 0024 下午 9:05
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}
