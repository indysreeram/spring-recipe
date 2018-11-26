package com.sreeram.springrecipe.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Value("${spring.message}")
    private String message;

    @RequestMapping({"","/","index","index.html"})
    public String getIndexPage(Model model){
        System.out.println("I am in the index controller!!!");
         return "index";
    }

    @RequestMapping({"/hello"})
    public String hello(Model model){
        model.addAttribute("message",message);
        return "hello";
    }


}
