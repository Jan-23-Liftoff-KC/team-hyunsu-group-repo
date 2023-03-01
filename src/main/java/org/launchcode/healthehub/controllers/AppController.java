package org.launchcode.healthehub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("title", "Health eHub");
        return "index";
    }
}