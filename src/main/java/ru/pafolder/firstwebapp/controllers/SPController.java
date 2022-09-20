package ru.pafolder.firstwebapp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SPController {
    public static Logger log = LoggerFactory.getLogger(SPController.class);
@GetMapping("/greeting")
    public String sayHello (Model model) {
    String [] messages = {"First message &#x60", "Second message", "Third message"};
    model.addAttribute("messages", messages);
    model.addAttribute("initText", "Ed ME!!!");

    log.error("Logger is called");
        return "greeting";
    }

    @GetMapping("")
    public String indEx (Model model) {
//        ModelAndView modelAndView = ModelAndView();
//        modelAndView.setView(new RedirectView(""));
    model.addAttribute("refer", "Sergeychik! ");
                return "index";
    }

}
