package org.launchcode.healthehub.controllers;


import org.launchcode.healthehub.models.Provider;
import org.launchcode.healthehub.models.data.ProviderRepository;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("provider")
public class ProviderController {

    @Autowired
    ProviderRepository providerRepository;
    @Autowired
    UserRepository userRepository;

    //    get view
    @RequestMapping(value = "view", method = RequestMethod.GET)
    public String getProviderView(Model model) {
        model.addAttribute("title", "Health eHub: Provider");
        model.addAttribute("providers", providerRepository.findAll());
        return "provider/view";
    }
    //    get add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String showAddProvider(Model model) {
        model.addAttribute("title", "Health eHub: Provider");
        model.addAttribute(new Provider());
        return "provider/add";
    }
    //    post add
    @RequestMapping(value = "add", method = RequestMethod.POST, params ="save")
//    @PostMapping("add")
    public String saveProvider(@ModelAttribute @Valid Provider newProvider, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "provider/add";
        } else {
            providerRepository.save(newProvider);
            return "redirect:/provider/view";
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, params = "addAnother")
    public String addAnotherProvider(@ModelAttribute @Valid Provider newProvider, Errors errors, Model model, HttpServletRequest request) {

        if (errors.hasErrors()) {
            model.addAttribute("message", "There is a problem with your information. Please double check all entries.");
            return "provider/add";
        }

        providerRepository.save(newProvider);
        model.addAttribute("message", "Save successful.");
        return "redirect:/provider/add";
    }

//    public ProviderRepository getProviderRepository() {
//        return this.providerRepository;
//    }
//
//    public UserRepository getUserRepository() {
//        return this.userRepository;
//    }
//
//    public void setProviderRepository(ProviderRepository providerRepository) {
//        this.providerRepository = providerRepository;
//    }
//
//    public void setUserRepository(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }



//    get edit - TODO fix later
//    @GetMapping("edit/{providerId}")
//    public String showEditProviderForm(@PathVariable int providerId, Model model) {
//       model.addAttribute("title", "Health eHub: Provider");
//        if (hospRepository.findById(providerId).isPresent()) {
//            model.addAttribute("provider", providerRepository.findById(providerId).get());
//        }
//        return "/provider/edit";
//    }
//    post edit - TODO fix later
//    @PostMapping("edit")
//    public String processEditProviderForm(@Valid Provider provider, BindingResult result) {
//        if (result.hasErrors()) {
//            return "/provider/edit";
//        } else {
//            hospRepository.save(provider);
//            return "/provider/view";
//        }
//    }
//    get delete - TODO later

//    post delete - TODO later

}
