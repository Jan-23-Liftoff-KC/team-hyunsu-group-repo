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
@RequestMapping("Allergy")
public class AllergyController {

    @Autowired
    AllergyRepository AllergyRepository;
    @Autowired
    UserRepository userRepository;

    //    get view
    @RequestMapping(value = "view", method = RequestMethod.GET)
    public String getHospView(Model model) {
        model.addAttribute("title", "Health eHub: Allergy");
        model.addAttribute("allergy", allergyRepository.findAll());
        return "allergy/view";
    }
    //    get add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String showAddHosp(Model model) {
        model.addAttribute("title", "Health eHub: Allergy");
        model.addAttribute(new Allergy());
        return "allergy/add";
    }
    //    post add
    @RequestMapping(value = "add", method = RequestMethod.POST, params ="save")
//    @PostMapping("add")
    public String saveHosp(@ModelAttribute @Valid Allergy newAllergy, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "allergy/add";
        } else {
            allergyRepository.save(newAllergy);
            return "/allergy/view";
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, params = "addAnother")
    public String addAnotherHosp(@ModelAttribute @Valid Allergy newAllergy, Errors errors, Model model, HttpServletRequest request) {

        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "allergy/add";
        }

        hospRepository.save(newHosp);
        model.addAttribute("message", "Save successful.");
        return "/allergy/add";
    }

//    get edit - TODO fix later
//    @GetMapping("edit/{hospId}")
//    public String showEditHospForm(@PathVariable int hospId, Model model) {
//       model.addAttribute("title", "Health eHub: Hospitalization");
//        if (hospRepository.findById(hospId).isPresent()) {
//            model.addAttribute("hosp", hospRepository.findById(hospId).get());
//        }
//        return "/hospitalization/edit";
//    }
//    post edit - TODO fix later
//    @PostMapping("edit")
//    public String processEditHospForm(@Valid Hospitalization hospitalization, BindingResult result) {
//        if (result.hasErrors()) {
//            return "/hospitalization/edit";
//        } else {
//            hospRepository.save(hospitalization);
//            return "/hospitalization/view";
//        }
//    }
//    get delete - TODO later

//    post delete - TODO later

}
