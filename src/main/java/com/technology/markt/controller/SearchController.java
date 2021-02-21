package com.technology.markt.controller;

import com.technology.markt.service.ComputerService;
import com.technology.markt.service.MobilePhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SearchController {

    @Autowired
    ComputerService computerService;

    @Autowired
    MobilePhoneService mobilePhoneService;


    @RequestMapping("/search")
    public ModelAndView searchPage()
    {
        Map<String, Object> model = new HashMap<String, Object>();

        return new ModelAndView( "search", model);
    }


}
