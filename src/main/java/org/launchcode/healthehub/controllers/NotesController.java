package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.Note;
import org.launchcode.healthehub.models.data.NoteRepository;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping("notes")
public class NotesController {
    @Autowired
    private NoteRepository noteRepository;
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("add")
    public String showAddNote(Model model) {
        model.addAttribute("title", "Health eHub: Dashboard");
        model.addAttribute("user", userRepository.findById(4));
        model.addAttribute(new Note());
        return "notes/add";
    }
    
    @PostMapping("add")
    public String processAddNote(@ModelAttribute @Valid Note newNote, Errors errors, Model model) {
        if(errors.hasErrors()){
            model.addAttribute("message","There is a problem saving your note.");
            return "notes/add";
        } else {
            LocalDate date = LocalDate.now();
            String strDate = date.toString();
            newNote.setDate(strDate);
            noteRepository.save(newNote);
            return "redirect:../user/dashboard";
        }
    }

//    get edit - TODO later

//    post edit - TODO later

//    get delete - TODO later

//    post delete - TODO later
}