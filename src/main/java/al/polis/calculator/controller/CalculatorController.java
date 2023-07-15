package al.polis.calculator.controller;

import al.polis.calculator.dto.AddTwoNumbersReqDto;
import al.polis.calculator.dto.LoginReqDto;
import al.polis.calculator.dto.LoginRespDto;
import al.polis.calculator.service.CalculatorService;
import al.polis.calculator.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
        String token = securityService.login2(req.getUsername(), req.getPassword());
        LoginRespDto resp = new LoginRespDto();
        resp.setToken(token);
        return resp;
    }
}
