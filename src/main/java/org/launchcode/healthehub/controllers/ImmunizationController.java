package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.Immunization;
import org.launchcode.healthehub.models.data.ImmunizationRepository;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("immunization")
public class ImmunizationController {

    @Autowired
    ImmunizationRepository shotRepository;
    @Autowired
    UserRepository userRepository;

    //    get view
    @RequestMapping(value = "view", method = RequestMethod.GET)
    public String getShotView(Model model) {
        model.addAttribute("title", "Health eHub: Immunization");
        model.addAttribute("immunizations", shotRepository.findAll());
        return "immunization/view";
    }
    //    get add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String showAddShot(Model model) {
        model.addAttribute("title", "Health eHub: Immunization");
        model.addAttribute(new Immunization());
        return "immunization/add";
    }
    //    post add
    @RequestMapping(value = "add", method = RequestMethod.POST, params ="save")
    public String saveShot(@ModelAttribute @Valid Immunization newShot, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "immunization/add";
        } else {
            shotRepository.save(newShot);
            return "immunization/view";
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, params = "addAnother")
    public String addAnotherShot(@ModelAttribute @Valid Immunization newShot, Errors errors, Model model, HttpServletRequest request) {

        if (errors.hasErrors()) {
            return "immunization/add";
        }

        shotRepository.save(newShot);
        model.addAttribute("message", "Save successful.");
        return "/immunization/add";
    }

//    get edit - TODO fix later
//    @GetMapping("edit/{shotId}")
//    public String showEditShotForm(@PathVariable int shotId, Model model) {
//       model.addAttribute("title", "Health eHub: Immunization");
//        if (shotRepository.findById(hospId).isPresent()) {
//            model.addAttribute("shot", shotRepository.findById(hospId).get());
//        }
//        return "/immunization/edit";
//    }
//    post edit - TODO fix later
//    @PostMapping("edit")
//    public String processEditHospForm(@Valid Immunization shot, BindingResult result) {
//        if (result.hasErrors()) {
//            return "/immunization/edit";
//        } else {
//            shotRepository.save(shot);
//            return "/immunization/view";
//        }
//    }
//    get delete - TODO later

//    post delete - TODO later

}
