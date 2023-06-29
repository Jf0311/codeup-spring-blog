package com.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /*
    /hello ->Hello World
    /hello? name = bob Hello , bob
    /hello/bob ->Hello bob!
     */
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "<h1>Hello , World!</h1>";
    }
}
