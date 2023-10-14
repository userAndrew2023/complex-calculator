package calculator;

public record ComplexNumber(double real, double imaginary) {

    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.real();
        double imaginaryPart = this.imaginary + other.imaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double realPart = this.real - other.real();
        double imaginaryPart = this.imaginary - other.imaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = (this.real * other.real()) - (this.imaginary * other.imaginary());
        double imaginaryPart = (this.real * other.imaginary()) + (this.imaginary * other.real());
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = (other.real() * other.real()) + (other.imaginary() * other.imaginary());
        double realPart = ((this.real * other.real()) + (this.imaginary * other.imaginary())) / divisor;
        double imaginaryPart = ((this.imaginary * other.real()) - (this.real * other.imaginary())) / divisor;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}