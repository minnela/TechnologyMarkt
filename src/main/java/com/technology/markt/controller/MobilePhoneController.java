package com.technology.markt.controller;

import com.technology.markt.domain.Computer;
import com.technology.markt.domain.MobilePhone;
import com.technology.markt.service.MobilePhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class MobilePhoneController {
    MobilePhoneService mobilePhoneService;

    @Autowired
    public MobilePhoneController(MobilePhoneService mobilePhoneService) {
        this.mobilePhoneService = mobilePhoneService;
    }

    @RequestMapping("/addMobilePhone")
    public ModelAndView getMobilePhoneInsertionPage(){
        return new ModelAndView("addMobilePhone", "mobilePhone", new MobilePhone());
    }
    @RequestMapping(value="/addMobilePhone", method= RequestMethod.POST)
    public String handleComputerForm(@ModelAttribute("mobilePhone") MobilePhone mobilePhone, BindingResult bindingResult) throws SQLException {
        if(bindingResult.hasErrors()){
            return "addMobilePhone";
        }
        mobilePhoneService.addMobilePhone(mobilePhone);
        return "redirect:/";
    }


}
