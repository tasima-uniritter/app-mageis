package com.tasima.appmageis.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/")
    String home() {
        return "index";
    }
    
    @RequestMapping("/execute")
    String execute() {
        return "execute";
    }
}