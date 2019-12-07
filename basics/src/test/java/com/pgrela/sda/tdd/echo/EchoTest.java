package com.pgrela.sda.tdd.echo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.ArrayList;
import java.util.List;

@TestInstance(Lifecycle.PER_CLASS)
class EchoTest {

    @Test
    void shouldAssertArrayOfStrings(){
        String[] stringArray = {"Red", "Hot", "Chili", "Peppers"};

        String[] echoed = Echo.echo(stringArray);

        // TODO(ASSERTIONS) assert result
    }

    @Test
    void same(){
        ArrayList<Object> pierwsza = new ArrayList<>();
        pierwsza.add(1);
        ArrayList<Object> druga = new ArrayList<>();
        druga.add(1);
        Assertions.assertEquals(pierwsza, druga);
        Assertions.assertSame(pierwsza, pierwsza);
    }

    /* TODO(ASSERTIONS) create test methods and use following Assertions:
        Assertions.assertTrue();
        Assertions.assertFalse();
        Assertions.assertArrayEquals();
        Assertions.assertEquals();
        Assertions.assertNotEquals();
        Assertions.assertNull();
        Assertions.assertNotNull();
        Assertions.assertIterableEquals();
        Assertions.assertLinesMatch();
        Assertions.assertSame();
        Assertions.assertNotSame();
        Assertions.fail();
     */

    @Test
    void assertLines(){
        List<String> actual = new ArrayList<>();
        actual.add("header");
        actual.add("first");
        actual.add("second");
        actual.add("third three");

        List<String> expected = new ArrayList<>();
        expected.add("header");
        expected.add(">> 2 >>");
        expected.add("th.rd thre+");

        // TODO(ASSERTIONS) Why do they match?
        Assertions.assertLinesMatch(expected, actual);
    }
}