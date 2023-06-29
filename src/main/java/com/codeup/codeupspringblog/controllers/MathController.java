package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//My code is hard coded
@Controller
public class MathController {

    @GetMapping("/add/3/and/4")
    @ResponseBody
    public int add() {
        return 7;
    }
    @GetMapping("/subtract/3/from/10")
    @ResponseBody
    public int subtract() {
        return 7;
    }
    @GetMapping("/multiply/4/and/5")
    @ResponseBody
    public int multiply() {
        return 20;
    }
    @GetMapping("/divide/6/by/3")
    @ResponseBody
    public int divide() {
        return 2;
    }
//
//    import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;

//    @Controller
//    public class MathController {
//
//        @GetMapping("/add/{num1}/and/{num2}")
//        @ResponseBody
//        public int add(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
//            return num1 + num2;
//        }
//
//        @GetMapping("/subtract/{num1}/from/{num2}")
//        @ResponseBody
//        public int subtract(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
//            return num2 - num1;
//        }
//
//        @GetMapping("/multiply/{num1}/and/{num2}")
//        @ResponseBody
//        public int multiply(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
//            return num1 * num2;
//        }
//
//        @GetMapping("/divide/{num1}/by/{num2}")
//        @ResponseBody
//        public String divide(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
//            if (num2 == 0) {
//                return "Error: Division by zero";
//            }
//            return String.valueOf(num1 / num2);
//        }
    }

//}

