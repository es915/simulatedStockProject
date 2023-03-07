package com.start_up.simulatedStock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/1")
    public String aa() {
        return "customPage";
    }

    @GetMapping("/2")
    public String bb() {
        return "customGameHostPage";
    }

    @GetMapping("/3")
    public String cc() {
        return "customGameParticipantPage";
    }

//    @GetMapping("/offline")
//    public String customPage(Module module) {
//
//
//
//        return "customplay";
//    }

}
