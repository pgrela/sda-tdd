package com.pgrela.sda.tdd.calculator;

class RadixCalculator {
    private final int radix;

    RadixCalculator(int radix) {
        if (radix < 2) {
            throw new IllegalArgumentException("Radix cannot be less than 2!");
        }
        this.radix = radix;
    }

    String add(String a, String b) {
        int aInRadix10 = Integer.valueOf(a, radix);
        int bInRadix10 = Integer.valueOf(b, radix);
        int sumInRadix10 = aInRadix10 + bInRadix10;
        return Integer.toString(sumInRadix10, radix);
    }

}
