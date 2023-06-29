package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/post")
    @ResponseBody
    public  String postIndexString () {
        return "post index page";
    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public  String viewPostString () {
        return "view and individual post";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public  String viewFormString () {
        return "view the form for creating a post";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String createNewPost() {
        return "create a new post";
    }


}
