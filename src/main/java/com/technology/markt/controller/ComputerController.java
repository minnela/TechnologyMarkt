package com.technology.markt.controller;

import com.technology.markt.domain.Comments;
import com.technology.markt.domain.Computer;
import com.technology.markt.domain.MobilePhone;
import com.technology.markt.service.CommentsService;
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
import java.util.Map;

@Controller
public class ComputerController {
    ComputerService computerService;
    CommentsService commentsService;

    @Autowired
    public ComputerController(ComputerService computerService, CommentsService commentsService) {
        this.computerService = computerService;
        this.commentsService = commentsService;
    }

    @RequestMapping("/addComputer")
    public ModelAndView getComputerInsertionPage(){
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("computer", new Computer());
        return new ModelAndView("addComputer", model);
    }

    @RequestMapping(value="/addComputer", method= RequestMethod.POST)
    public String handleComputerForm(@ModelAttribute("computer") Computer computer, BindingResult bindingResult) throws SQLException {
        if(bindingResult.hasErrors()){
            return "addComputer";
        }
        String header = computer.getName();
        Comments comment = new Comments();
        comment.setName(header);
        commentsService.addComment(comment);
        computerService.addComputer(computer);
        return "redirect:/";
    }



}
