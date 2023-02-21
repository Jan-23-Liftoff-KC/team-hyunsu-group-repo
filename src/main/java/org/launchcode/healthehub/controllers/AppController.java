package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.User;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AppController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/")
    public String viewHomePage(){
        return "index";
    }
    @GetMapping("/user/registration")
    public String showRegistrationForm(Model model){
        model.addAttribute("register", new User());
        return "index";
    }
    @PostMapping(value = "/user/registration", params = "action: register")
    public String registerNewAccount(@ModelAttribute @Valid User newUser, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "/user/registration";
        }

        userRepository.save(newUser);
        return "index";
    }
}
