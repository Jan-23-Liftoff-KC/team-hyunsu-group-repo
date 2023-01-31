package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.User;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
    private UserRepository userRepo;
    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
    @GetMapping("create_user")
    public String showRegistrationForm(Model model){
        model.addAttribute("create_user", new User());
        return "create_user";
    }
}
