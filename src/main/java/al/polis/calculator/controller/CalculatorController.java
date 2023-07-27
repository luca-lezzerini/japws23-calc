package al.polis.calculator.controller;

import al.polis.calculator.dto.AddTwoNumbersReqDto;
import al.polis.calculator.dto.LoginReqDto;
import al.polis.calculator.dto.LoginRespDto;
import al.polis.calculator.service.CalculatorService;
import al.polis.calculator.service.SecurityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author henri
 */
@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;
    @Autowired
    private SecurityService securityService;

    @PostMapping("/add-two-numbers")
    public String add(@RequestBody AddTwoNumbersReqDto dto) {
        double number1 = dto.getNumber1();
        double number2 = dto.getNumber2();
        double result = calculatorService.sum(number1, number2);

        return "The result of " + number1 + " + " + number2 + " is " + result;
    }

    /**
     * Create a controller to multiply two numbers Request is:
     * /multiply-two-numbers
     *
     * @author Kedi
     * @param dto
     * @return
     *
     */
    @PostMapping("/multiply-two-numbers")
    public double multiply(@RequestBody AddTwoNumbersReqDto dto) {
        double number1 = dto.getNumber1();
        double number2 = dto.getNumber2();
        double result = calculatorService.multiply(number1, number2);

        return result;
    }

    /**
     * Create a controller to subtract two numbers Request is:
     * /subtract-n1-from-n2
     *
     * @author Henrik
     * @param dto
     * @return
     */
    @PostMapping("/subtract-n1-from-n2")
    public double subtract(@RequestBody AddTwoNumbersReqDto dto) {
        double number1 = dto.getNumber1();
        double number2 = dto.getNumber2();
        double result = calculatorService.subtract(number1, number2);

        return result;
    }

    /**
     * Create a controller to divide n1 by n2 Request is: /divide-n1-by-n2
     *
     * @author Kedi
     * @param dto
     * @param dto
     * @param dto
     * @return
     * @return
     *
     */
    @PostMapping("/divide-n1-by-n2")
    public double divide(@RequestBody AddTwoNumbersReqDto dto) {
        double number1 = dto.getNumber1();
        double number2 = dto.getNumber2();

        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        double result = calculatorService.divide(number1, number2);
        return result;
    }

    /**
     * Create a controller to calculate the remainder n1 % n2 Request is:
     * /remainder-n1-by-n2
     *
     * @author Henrik
     *
     */
    @PostMapping("/remainder-n1-by-n2")
    public double remainder(@RequestBody AddTwoNumbersReqDto dto) {
        double number1 = dto.getNumber1();
        double number2 = dto.getNumber2();

        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        double result = calculatorService.remainder(number1, number2);

        return result;
    }

    /**
     * This method will login with userame and password and return an OAUTH2
     * token
     */
    @PostMapping("/login")
    @ResponseBody
    public LoginRespDto login(@RequestBody LoginReqDto req) {
        String token = securityService.login3(req.getUsername(), req.getPassword());
        LoginRespDto resp = new LoginRespDto();
        resp.setToken(token);
        return resp;
    }
    
    /*
        New exercise for July, 17th 2023
        Create a Customer entity with 3 fields: name:String, city:String, balance:Double 
        Create a repository to find: 
            all customers with the same name -> findByName
            all customers with the same city -> findByName
            
        Create services and a controllers (methods) to:
            return the list of all customers
            return the list of all customers with a given name
            return the list of all customers with a given city
            return the list of all customers with a given name and city
    */
}
