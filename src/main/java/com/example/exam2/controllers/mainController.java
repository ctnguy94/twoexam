package com.example.exam2.controllers;

import com.example.exam2.Models.virusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {

    @Autowired
    virusRepo VirusRepo;
    @RequestMapping(value = "/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("viruslist", VirusRepo.findAll());
        return mv;
    }

}
