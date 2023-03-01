package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.Pharmacy;
import org.launchcode.healthehub.models.data.PharmacyRepository;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
@Controller
@RequestMapping("pharmacy")
public class PharmacyController {

    @Autowired
    PharmacyRepository pharmRepository;
    @Autowired
    UserRepository userRepository;

    //    get view
    @RequestMapping(value = "view", method = RequestMethod.GET)
    public String getPharmView(Model model) {
        model.addAttribute("title", "Health eHub: Pharmacy");
        model.addAttribute("pharmacies", pharmRepository.findAll());
        model.addAttribute("user", userRepository.findById(4));
        return "pharmacy/view";
    }
    //    get add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String showAddPharm(Model model) {
        model.addAttribute("title", "Health eHub: Pharmacy");
        model.addAttribute("user", userRepository.findById(4));
        model.addAttribute(new Pharmacy());
        return "pharmacy/add";
    }
    //    post add
    @RequestMapping(value = "add", method = RequestMethod.POST, params ="save")
//    @PostMapping("add")
    public String savePharm(@ModelAttribute @Valid Pharmacy newPharm, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("message","There is a problem with your information.");
            return "pharmacy/add";
        } else {
            pharmRepository.save(newPharm);
            return "redirect:/pharmacy/view";
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, params = "addAnother")
    public String addAnotherPharm(@ModelAttribute @Valid Pharmacy newPharm, Errors errors, Model model, HttpServletRequest request) {

        if (errors.hasErrors()) {
            model.addAttribute("message","There is a problem with your information.");
            return "pharmacy/add";
        } else {

            pharmRepository.save(newPharm);
            model.addAttribute("message", "Save successful.");
            return "redirect:/pharmacy/add";
        }
    }

//    get edit - TODO fix later
//    @GetMapping("edit/{pharmId}")
//    public String showEditPharmForm(@PathVariable int pharmId, Model model) {
//       model.addAttribute("title", "Health eHub: Pharmacy");
//        if (pharmRepository.findById(pharmId).isPresent()) {
//            model.addAttribute("pharm", pharmRepository.findById(pharmId).get());
//        }
//        return "/pharmacy/edit";
//    }
//    post edit - TODO fix later
//    @PostMapping("edit")
//    public String processEditPharmForm(@Valid Pharmacy pharmacy, BindingResult result) {
//        if (result.hasErrors()) {
//            return "/pharmacy/edit";
//        } else {
//            hospRepository.save(pharmacy);
//            return "/pharmacy/view";
//        }
//    }
//    get delete - TODO later

//    post delete - TODO later

}

