package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String showDiceRoll(){
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String rollDice(@PathVariable int guess, Model model) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;
        String message;

        if (guess == diceRoll) {
            message = "Congratulations! You guessed correctly.";
        } else {
            message = "Sorry, your guess was incorrect.";
        }

        model.addAttribute("diceRoll", diceRoll);
        model.addAttribute("guess", guess);
        model.addAttribute("message", message);

        return "roll-dice-result";
    }

}
