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
import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("notes")
public class NotesController {
    @Autowired
    private NotesRepository notesRepository;
    @Autowired
    private UserRepository userRepository;
    


//    get edit - TODO later

//    post edit - TODO later

//    get delete - TODO later

//    post delete - TODO later
}