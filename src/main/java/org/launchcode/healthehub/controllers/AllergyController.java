package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.Allergy;
import org.launchcode.healthehub.models.data.AllergyRepository;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Controller
@RequestMapping("allergy")
public class AllergyController {

    @Autowired
    AllergyRepository allergyRepository;
    @Autowired
    UserRepository userRepository;

    //    get view
    @RequestMapping(value = "view", method = RequestMethod.GET)
    public String getAllergyView(Model model) {
        model.addAttribute("title", "Health eHub: Allergy");
        model.addAttribute("allergy", allergyRepository.findAll());
        return "/allergy/view";
    }
    //    get add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String showAddAllergy(Model model) {
        model.addAttribute("title", "Health eHub: Allergy");
        model.addAttribute(new Allergy());
        return "/allergy/add";
    }
    //    post add
    @RequestMapping(value = "add", method = RequestMethod.POST, params ="save")
//    @PostMapping("add")
    public String saveAllergy(@ModelAttribute @Valid Allergy newAllergy, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "/allergy/add";
        } else {
            allergyRepository.save(newAllergy);
            return "/allergy/view";
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, params = "addAnother")
    public String addAnotherAllergy(@ModelAttribute @Valid Allergy newAllergy, Errors errors, Model model, HttpServletRequest request) {

        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "/allergy/add";
        }

        allergyRepository.save(newAllergy);
        model.addAttribute("message", "Save successful.");
        return "/allergy/add";
    }

//    get edit - TODO fix later
//    @GetMapping("edit/{allergyId}")
//    public String showEditAllergyForm(@PathVariable int allergyId, Model model) {
//       model.addAttribute("title", "Health eHub: Allergy");
//        if (hospRepository.findById(allergyId).isPresent()) {
//            model.addAttribute("allergy", allergyRepository.findById(hospId).get());
//        }
//        return "/allergy/edit";
//    }
//    post edit - TODO fix later
//    @PostMapping("edit")
//    public String processEditAllergyForm(@Valid Allergy allergy, BindingResult result) {
//        if (result.hasErrors()) {
//            return "/allergy/edit";
//        } else {
//            hospRepository.save(hospitalization);
//            return "/allergy/view";
//        }
//    }
//    get delete - TODO later

//    post delete - TODO later

}
