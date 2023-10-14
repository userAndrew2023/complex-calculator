import calculator.Calculator;
import calculator.ComplexNumber;
import calculator.logger.Logger;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Logger());
        calculator.add(new ComplexNumber(3.5, 3.4), new ComplexNumber(3.5, 3.4));
    }
}
