package com.beskilled.onlinebanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String displayHome() {
        return "layout";
    }

    @GetMapping(value = "/fo.jsf")
    public String displayFooter() {
        return "fragment/nav";
    }


}
