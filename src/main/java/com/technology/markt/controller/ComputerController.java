package com.technology.markt.controller;

import com.technology.markt.domain.Computer;
import com.technology.markt.domain.MobilePhone;
import com.technology.markt.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class ComputerController {
    ComputerService computerService;

    @Autowired
    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @RequestMapping("/addComputer")
    public ModelAndView getComputerInsertionPage(){
        return new ModelAndView("addComputer", "computer", new Computer());
    }

    @RequestMapping(value="/addComputer", method= RequestMethod.POST)
    public String handleComputerForm(@ModelAttribute("computer") Computer computer, BindingResult bindingResult) throws SQLException {
        if(bindingResult.hasErrors()){
            return "addComputer";
        }
        computerService.addComputer(computer);
        return "redirect:/";
    }



}
