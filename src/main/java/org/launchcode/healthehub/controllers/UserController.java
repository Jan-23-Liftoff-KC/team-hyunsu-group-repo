package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.User;
import org.launchcode.healthehub.models.data.NoteRepository;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("registration")
    public String showRegistrationForm(Model model){
        model.addAttribute("title", "Health eHub: Account Registration");
        model.addAttribute("user", new User());
        return "/user/registration";
    }
    @PostMapping("registration")
    public String registerNewAccount(@ModelAttribute @Valid User newUser, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "/user/registration";
        } else {
            userRepository.save(newUser);
            int userId = newUser.getUserId();
            return "/user/dashboard";
        }
    }

    @GetMapping("dashboard/{userId}")
    public String viewDashboard(@PathVariable int userId, Model model) {
        model.addAttribute("title", "Health eHub");
        Optional<User> optUser = userRepository.findById(4);
        if (optUser.isPresent()) {
            User user = (User) optUser.get();
            model.addAttribute("user", user);
            model.addAttribute("notes", noteRepository.findAll());
            return "/user/dashboard";
        } else {
            return "redirect:../";
        }

    }
}
