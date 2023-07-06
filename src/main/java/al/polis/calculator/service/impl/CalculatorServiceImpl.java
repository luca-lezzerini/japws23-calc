package al.polis.calculator.service.impl;

import al.polis.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

}
