package com.pgrela.sda.tdd.calculator;

class DoubleCalculator {
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return add(a, -b);
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double dividend, double divisor) {
        checkDivisorNotZero(divisor);
        return dividend / divisor;
    }

    int modulo(int dividend, int divisor) {
        checkDivisorNotZero(divisor);
        return dividend % divisor;
    }


    private void checkDivisorNotZero(int divisor) {
        if (divisor == 0) {
            throw throwZeroDivisorException();
        }
    }

    private void checkDivisorNotZero(double divisor) {
        if (-Double.MIN_VALUE < divisor && divisor < Double.MIN_VALUE) {
            throw throwZeroDivisorException();
        }
    }

    private IllegalArgumentException throwZeroDivisorException() {
        return new IllegalArgumentException("Divisor can not be zero!");
    }
}
