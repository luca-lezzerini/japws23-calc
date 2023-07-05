package al.polis.calculator.controller;

import al.polis.calculator.dto.AddTwoNumbersReqDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @PostMapping("/add-two-numbers")
    public String add(@RequestBody AddTwoNumbersReqDto dto) {
        System.out.println("Message received!");
        System.out.println("Parameter 1 is " + dto.getNumber1());
        System.out.println("Parameter 2 is " + dto.getNumber2());
        double result = dto.getNumber1() + dto.getNumber2();
        System.out.println("The result is " + result);
        return "The result of " + dto.getNumber1() + " + " + dto.getNumber2() + " is " + result;
    }
    
    /**
     * Create a controller to multiply two numbers
     * Request is: /multiply-two-numbers
     * @author Kedi
     */
    
    /**
     * Create a controller to subtract two numbers
     * Request is: /subtract-n1-from-n2
     * @author Henrik
     */
}
