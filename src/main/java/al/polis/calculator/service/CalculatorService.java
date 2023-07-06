package al.polis.calculator.service;

public interface CalculatorService {

    double sum(double a, double b);

    double subtract(double number1, double number2);

    double remainder(double number1, double number2);
    double multiply(double number1, double number2);

    double divide (double number1, double number2);
}
