package com.technology.markt.controller;

import com.technology.markt.domain.Computer;
import com.technology.markt.domain.MobilePhone;
import com.technology.markt.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComputerController {
    ComputerService computerService;

    @Autowired
    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @RequestMapping("/insertComputer")
    public ModelAndView getComputerInsertionPage(){
        return new ModelAndView("addComputer", "computer", new Computer());
    }
}
