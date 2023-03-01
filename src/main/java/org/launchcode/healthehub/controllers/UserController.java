package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.Note;
import org.launchcode.healthehub.models.User;
import org.launchcode.healthehub.models.data.NotesRepository;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NotesRepository notesRepository;

    @GetMapping("registration")
    public String showRegistrationForm(Model model){
        model.addAttribute("title", "Health eHub: Account Registration");
        model.addAttribute("user", new User());
        return "user/registration";
    }
    @PostMapping("registration")
    public String registerNewAccount(@ModelAttribute @Valid User newUser, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "user/registration";
        } else {
            userRepository.save(newUser);
            int userId = newUser.getId();
            return "user/dashboard";
        }
    }

    @GetMapping("dashboard")
    public String viewDashboard(Model model) {
        model.addAttribute("title", "Health eHub");
        Optional<User> optUser = userRepository.findById(4);
        if (optUser.isPresent()) {
            User user = (User) optUser.get();
            model.addAttribute("user", user);
            model.addAttribute("notes", notesRepository.findAll());
            return "user/dashboard";
        } else {
            return "redirect:/../index";
        }
    }

    @GetMapping("addNote")
    public String showAddNote(Model model) {
        model.addAttribute("title", "Health eHub: Dashboard");
        model.addAttribute("user", userRepository.findById(4));
        model.addAttribute("notes",notesRepository.findAll());
        model.addAttribute(new Note());
        return "user/addNote";
    }

    @PostMapping("addNote")
    public String processAddNote(@ModelAttribute @Valid Note newNote, Errors errors, Model model) {
        model.addAttribute("user", userRepository.findById(4));
        model.addAttribute("notes", notesRepository.findAll());
        if(errors.hasErrors()){
            model.addAttribute("message","There is a problem saving your note.");
            return "user/addNote";
        } else {
            LocalDate date = LocalDate.now();
            String strDate = date.toString();
            newNote.setDate(strDate);
            notesRepository.save(newNote);
            return "user/dashboard";
        }
    }
}
