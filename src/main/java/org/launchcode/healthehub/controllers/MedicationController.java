package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.Medication;
import org.launchcode.healthehub.models.data.MedicationRepository;
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
@RequestMapping("medication")
public class MedicationController {

    @Autowired
    MedicationRepository medicationRepository;
    @Autowired
    UserRepository userRepository;

    //    get view
    @RequestMapping(value = "view", method = RequestMethod.GET)
    public String getMedicationView(Model model) {
        model.addAttribute("title", "Health eHub: Medication");
        model.addAttribute("medications", medicationRepository.findAll());
        return "medication/view";
    }
    //    get add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String showAddMedication(Model model) {
        model.addAttribute("title", "Health eHub: Medication");
        model.addAttribute(new Medication());
        return "medication/add";
    }
    //    post add
    @RequestMapping(value = "add", method = RequestMethod.POST, params ="save")
//    @PostMapping("add")
    public String saveMedication(@ModelAttribute @Valid Medication newMedication, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "medication/add";
        } else {
            medicationRepository.save(newMedication);
            return "redirect:/medication/view";
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, params = "addAnother")
    public String addAnotherMedication(@ModelAttribute @Valid Medication newMedication, Errors errors, Model model, HttpServletRequest request) {

        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "medication/add";
        }

        medicationRepository.save(newMedication);
        model.addAttribute("message", "Save successful.");
        return "redirect:/medication/add";
    }

//    get edit - TODO fix later
//    @GetMapping("edit/{medicationId}")
//    public String showEditMedicationForm(@PathVariable int medicationId, Model model) {
//       model.addAttribute("title", "Health eHub: Medication");
//        if (medicationRepository.findById(MedicationId).isPresent()) {
//            model.addAttribute("medication", medicationRepository.findById(medicationId).get());
//        }
//        return "medication/edit";
//    }
//    post edit - TODO fix later
//    @PostMapping("edit")
//    public String processEditMedicationForm(@Valid Medication medication, BindingResult result) {
//        if (result.hasErrors()) {
//            return "medication/edit";
//        } else {
//            medicationRepository.save(medication);
//            return "medication/view";
//        }
//    }
//    get delete - TODO later

//    post delete - TODO later

}
