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
     * @param dto
     * @return 
     * 
     */
     @PostMapping("/multiply-two-numbers")
     public String multiply(@RequestBody AddTwoNumbersReqDto dto) {
        System.out.println("Message received!");
        System.out.println("Parameter 1 is " + dto.getNumber1());
        System.out.println("Parameter 2 is " + dto.getNumber2());
        double result = dto.getNumber1() * dto.getNumber2();
        System.out.println("The result is " + result);
        return "The result of " + dto.getNumber1() + " + " + dto.getNumber2() + " is " + result;
    }
    /**
     * Create a controller to subtract two numbers
     * Request is: /subtract-n1-from-n2
     * @author Henrik 
     * @param dto 
     * @return  
     */
    @PostMapping("/subtract-n1-from-n2")
    public String subtract(@RequestBody AddTwoNumbersReqDto dto) {
        System.out.println("Message received!");
        System.out.println("Parameter 1 is " + dto.getNumber1());
        System.out.println("Parameter 2 is " + dto.getNumber2());
        double result = dto.getNumber1() - dto.getNumber2();
        System.out.println("The result is " + result);
        return "The result of " + dto.getNumber1() + " + " + dto.getNumber2() + " is " + result;
   }

    
  /**
     * Create a controller to divide n1 by n2
     * Request is: /divide-n1-by-n2
     * @author Kedi 
     * 
     */
      @PostMapping("/divide-n1-by-n2")
    public String divide(@RequestBody AddTwoNumbersReqDto dto) {
        System.out.println("Message received!");
        System.out.println("Parameter 1 is " + dto.getNumber1());
        System.out.println("Parameter 2 is " + dto.getNumber2());
        double result = dto.getNumber1() / dto.getNumber2();
         System.out.println("The result is " + result);
        return "The result of " + dto.getNumber1() + " + " + dto.getNumber2() + " is " + result;
    }
    
 

    
    /**
     * Create a controller to calculate the remainder n1 % n2
     * Request is: /remainder-n1-by-n2
     * @author Henrik
     * 
     */
    @PostMapping("/remainder-n1-by-n2")
public String remainder(@RequestBody AddTwoNumbersReqDto requestDto) {
    System.out.println("Message received!");
    System.out.println("Parameter 1 is " + requestDto.getNumber1());
    System.out.println("Parameter 2 is " + requestDto.getNumber2());

    if (requestDto.getNumber2() == 0) {
        return "Error: Cannot divide by zero";
    }

    double result = requestDto.getNumber1() % requestDto.getNumber2();
    System.out.println("The result is " + result);

    return "The result of " + requestDto.getNumber1() + " % " + requestDto.getNumber2() + " is " + result;
}

}