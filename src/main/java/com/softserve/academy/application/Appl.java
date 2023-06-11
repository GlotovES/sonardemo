package com.softserve.academy.application;

import com.softserve.academy.service.Calc;

public class Appl {

    public int add(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("1 + 2 = " + calc.add(1, 2));
        System.out.println("1.5 + 2.5 = " + calc.add(1.5, 2.5));
        System.out.println("4 - 2 = " + calc.sub(4, 2));
        System.out.println("2.5 - 1.5 = " + calc.sub(2.5, 1.5));
    }
}
