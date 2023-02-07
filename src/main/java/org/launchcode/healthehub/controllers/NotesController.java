package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.Notes;
import org.launchcode.healthehub.models.data.NotesRepository;
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

@Controller
@RequestMapping("notes")
public class NotesController {
    @Autowired
    private NotesRepository notesRepository;
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("add")
    public String showAddNote(Model model) {
        model.addAttribute(new Notes());
        model.addAttribute(userRepository.findAll());
        return "notes/add";
    }
    
    @PostMapping("add")
    public String processAddNote(@ModelAttribute @Valid Notes newNote, Errors errors, Model model) {
        if(errors.hasErrors()){
        return "notes/add";
        }
        newNote.setDate();
        notesRepository.save(newNote);
        return "redirect:";
    }
}
