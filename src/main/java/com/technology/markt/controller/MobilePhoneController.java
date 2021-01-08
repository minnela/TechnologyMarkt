package com.technology.markt.controller;

import com.technology.markt.domain.MobilePhone;
import com.technology.markt.service.MobilePhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MobilePhoneController {
    MobilePhoneService mobilePhoneService;

    @Autowired
    public MobilePhoneController(MobilePhoneService mobilePhoneService) {
        this.mobilePhoneService = mobilePhoneService;
    }

    @RequestMapping("/insertPhone")
    public ModelAndView getMobilePhoneInsertionPage(){
        return new ModelAndView("addMobilePhone", "mobilePhone", new MobilePhone());
    }



}
