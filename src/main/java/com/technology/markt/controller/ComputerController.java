package com.technology.markt.controller;

import com.technology.markt.domain.Computer;
import com.technology.markt.domain.ComputerComments;
import com.technology.markt.service.ComputerCommentsService;
import com.technology.markt.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ComputerController {
    ComputerService computerService;
    ComputerCommentsService computerCommentsService;

    @Autowired
    public ComputerController(ComputerService computerService, ComputerCommentsService computerCommentsService) {
        this.computerService = computerService;
        this.computerCommentsService = computerCommentsService;
    }

    @RequestMapping("/addComputer")
    public ModelAndView getComputerInsertionPage(){
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("computers", computerService.listAllComputers());
        model.put("comment", new ComputerComments());
        return new ModelAndView( "addComputer", model);
    }

    @RequestMapping(value="/addComputer", method= RequestMethod.POST)
    public String handleComputerForm(@ModelAttribute("comment") ComputerComments computerComments, BindingResult bindingResult) throws SQLException {
        if(bindingResult.hasErrors()){
            return "addComputer";
        }
        computerCommentsService.addComputerComments(computerComments);
        return "redirect:/";
    }



}
