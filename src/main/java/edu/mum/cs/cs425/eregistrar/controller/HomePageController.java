package edu.mum.cs.cs425.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping(value = {"/","/eRegister","/eRigister/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
