package calculator;

import calculator.logger.Logger;

public class Calculator {
    private final Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.add(b);
        logger.info("Сложение: " + a + " + " + b + " = " + result);
        return result;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.subtract(b);
        logger.info("Вычитание: " + a + " - " + b + " = " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.multiply(b);
        logger.info("Умножение: " + a + " * " + b + " = " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.divide(b);
        logger.info("Деление: " + a + " / " + b + " = " + result);
        return result;
    }
}