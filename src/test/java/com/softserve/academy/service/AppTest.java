package com.softserve.academy.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
    private static Calc calc;

    @BeforeAll
    public static void setup() {
        calc = new Calc();
    }

    @ParameterizedTest
    @CsvSource(value = {"4,5,9", "1,1,2", "1,-1,0"}, delimiter = ',')
    void checkAdd(int arg0, int arg1, int expected) {
        System.out.println("checkAdd(int)");
        Assertions.assertEquals(expected, calc.add(arg0, arg1));
    }

    @ParameterizedTest
    @CsvSource(value = {"-1,1,0", "1.3,1.2,2.5", "1,-1,0"}, delimiter = ',')
    void checkAdd(double arg0, double arg1, double expected) {
        System.out.println("checkAdd(double)");
        Assertions.assertEquals(expected, calc.add(arg0, arg1),0.001);
    }

    @ParameterizedTest
    @CsvSource(value = {"9,5,4", "5,5,0", "1,-1,2"}, delimiter = ',')
    void checkSub(int arg0, int arg1, int expected) {
        System.out.println("checkSub(int)");
        Assertions.assertEquals(expected, calc.sub(arg0, arg1));
    }

    @ParameterizedTest
    @CsvSource(value = {"9,5,4", "5.1,5,0.1", "5.1,5.2,-0.1"}, delimiter = ',')
    void checkSub(double arg0, double arg1, double expected) {
        System.out.println("checkSub(double)");
        Assertions.assertEquals(expected, calc.sub(arg0, arg1), 0.001);
    }

}
