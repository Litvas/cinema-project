package com.asdevelopment.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cinema")
@Controller
public class CommonPageController {

    @RequestMapping()
    public String printWelcome() {
        return "index";
    }

}
