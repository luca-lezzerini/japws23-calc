package al.polis.calculator.service.impl;

import al.polis.calculator.model.CalculatorRow;
import al.polis.calculator.repository.CalculatorRowRepository;
import al.polis.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Autowired
    CalculatorRowRepository calculatorRowRepository;

    @Override
    public double sum(double a, double b) {
        String operator = "+";
        CalculatorRow cr = new CalculatorRow();
        cr.setFirstNumber(a);
        cr.setSecondNumber(b);
        final double result = a + b;
        cr.setResult(result);
        cr.setOperator(operator);
        calculatorRowRepository.save(cr);

        return result;

    }

    @Override
    public double subtract(double a, double b) {
        CalculatorRow cr = new CalculatorRow();
        cr.setFirstNumber(a);
        cr.setSecondNumber(b);
        cr.setOperator("-");
        double result = a - b;
        cr.setResult(result);
        calculatorRowRepository.save(cr);
        return result;
        
        
    }

    @Override
    public double remainder(double number1, double number2) {
        CalculatorRow cr = new CalculatorRow();
        cr.setFirstNumber(1);
        cr.setSecondNumber(number2);
        cr.setOperator("%");
        double result = number1 % number2;
        cr.setResult(result);
        calculatorRowRepository.save(cr);
        return result;
    }

    @Override
    public double multiply(double number1, double number2) {
        CalculatorRow cr = new CalculatorRow();
        cr.setFirstNumber(1);
        cr.setSecondNumber(number2);
        cr.setOperator("*");
        double result = number1*number2;
        cr.setResult(result);
        calculatorRowRepository.save(cr);
        return result;
    }

    @Override
    public double divide(double number1, double number2) {
        return number1 / number2;
    }
}
