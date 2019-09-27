package com.pgrela.sda.tdd.echo;

import java.util.Arrays;

public class Echo {
    static <T> T echo(T object) {
        return object;
    }

    static <T> T[] echo(T[] object) {
        return Arrays.copyOf(object, object.length);
    }
}
