package com.technology.markt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String home(){
        return "home";
    }

}
