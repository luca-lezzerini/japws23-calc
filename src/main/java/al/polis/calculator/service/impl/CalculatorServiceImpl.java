package al.polis.calculator.service.impl;

import al.polis.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double sum(double a, double b) {
        return a + b;

    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double remainder(double number1, double number2) {
        return number1 % number2;
    }

    @Override
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    @Override
    public double divide(double number1, double number2) {
        return number1 / number2;
    }
}
