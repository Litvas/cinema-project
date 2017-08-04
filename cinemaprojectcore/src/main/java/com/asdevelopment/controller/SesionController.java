package com.asdevelopment.controller;


import com.asdevelopment.entity.Film;
import com.asdevelopment.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("cinema")
@Controller
public class SesionController {

    @Autowired
    private SessionService sessionService;


    @RequestMapping(value = "sessions", method = RequestMethod.GET)
    public String viewAllFilms(Model model) {
        model.addAttribute("listSessions", sessionService.getAllSessions());
        return "session/allsessions";
    }

}
