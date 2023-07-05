package al.polis.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add-two-numbers")
    public String add(){
        System.out.println("Message received!");
        return "Ok, gotcha!";
    }
}
