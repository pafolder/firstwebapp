package ru.pafolder.firstwebapp.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.IOException;

@RestController
public class SPRestController {

    @PostMapping(value="/TestInputName")
    public void nameInput(HttpServletResponse response, @RequestParam("answer") String answer) throws IOException {
        System.out.println(answer);
        Toolkit.getDefaultToolkit().beep();
        response.sendRedirect("/");
    }
/*
    @PostMapping(value="/ChoosingFlyAction")
    public void flyWasChosen(HttpServletResponse response, @RequestParam("answer") String answer) throws IOException {
        System.out.println(answer);
        response.sendRedirect("/");
    }

    @PostMapping(value="/input")
    public void inPut(HttpServletResponse response, @RequestParam("firstName") String answer) throws IOException {
        System.out.println("Input: " + answer);
        response.sendRedirect("/");
    }
*/
}
