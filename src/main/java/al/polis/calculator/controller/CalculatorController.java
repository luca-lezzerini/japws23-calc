package al.polis.calculator.controller;

import al.polis.calculator.dto.AddTwoNumbersReqDto;
import al.polis.calculator.dto.RemainderOfTwoNumbersDto;
import al.polis.calculator.model.CalculatorRow;
import al.polis.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

@PostMapping("/add-two-numbers")
    public String add(@RequestBody AddTwoNumbersReqDto dto) {
        double number1 = dto.getNumber1();
        double number2 = dto.getNumber2();
        double result = number1 + number2;

        CalculatorRow cr = new CalculatorRow();
        cr.setFirstNumber(number1);
        cr.setSecondNumber(number2);
        cr.setResult(result);
        calculatorRowRepository.save(cr);

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
        double result = number1 * number2;

        CalculatorRow cr = new CalculatorRow();
        cr.setNumber1(number1);
        cr.setNumber2(number2);
        cr.setResult(result);
        calculatorRowRepository.save(cr);

        return result;
    }
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
public double subtract(@RequestBody SubtractTwoNumbersReqDto dto) {
    double number1 = dto.getNumber1();
    double number2 = dto.getNumber2();
    double result = number1 - number2;

    AddTwoNumbersReqDto cr = new AddTwoNumbersReqDto();
    cr.setNumber1(number1);
    cr.setNumber2(number2);
    cr.setResult(result);
     
    return result;
}


    /**
     * Create a controller to divide n1 by n2 Request is: /divide-n1-by-n2
     *
     * @author Kedi
     *
     */
   @PostMapping("/divide-n1-by-n2")
public double divide(@RequestBody DivideNumbersReqDto dto) {
    double number1 = dto.getNumber1();
    double number2 = dto.getNumber2();

    if (number2 == 0) {
        throw new IllegalArgumentException("Cannot divide by zero");
    }

    double result = number1 / number2;

    Numbers numbers = new Numbers();
    numbers.setNumber1(number1);
    numbers.setNumber2(number2);
    numbersRepository.save(numbers);

    return result;
}
        




    /**
     * Create a controller to calculate the remainder n1 % n2 Request is:
     * /remainder-n1-by-n2
     *
     * @author Henrik
     *
     */
    @PostMapping("/divide-n1-by-n2")
    public double divide(@RequestBody DivideNumbersReqDto dto) {
        double number1 = dto.getNumber1();
        double number2 = dto.getNumber2();
        
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
}

        double result = number1 / number2;

        CalculatorRow cr = new CalculatorRow();
        cr.setNumber1(number1);
        cr.setNumber2(number2);
        cr.setResult(result);
        calculatorRowRepository.save(cr);

        return result;
    }

