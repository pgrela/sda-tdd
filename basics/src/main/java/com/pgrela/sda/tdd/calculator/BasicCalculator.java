package com.pgrela.sda.tdd.calculator;

class BasicCalculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return add(a, -b);
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    int modulo(int dividend, int divisor) {
        return dividend % divisor;
    }
}
