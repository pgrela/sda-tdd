package com.pgrela.sda.tdd.calculator;

class WeirdCalculator {

    boolean isEven(int n) {
        return ((((n & 1) << (1 << 1)) | 1) ^ 1) < 1;
    }

    boolean isOdd(int n) {
        return !isEven(n);
    }

    String skipZeroPrefix(String number) {
        return number.substring(number.replaceFirst("[^0]", "!").indexOf('!'));
    }

    int modulo4(int number) {
        int twelve = (((2 << 2) << 2) | (2 << 2)) << 2;
        return number % twelve == 1 ? number % (4 ^ 3) : number % (twelve / ((8 ^ 2) << 2));
    }

}
