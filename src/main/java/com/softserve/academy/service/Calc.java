package com.softserve.academy.service;

public class Calc {

    public int add(int arg0, int arg1) {
        int result = arg0 + arg1;
        return result;
    }

    public double add(double arg0, double arg1) {
        double result = arg0 + arg1;
        return result;
    }

    public int sub(int arg0, int arg1) {
        int result = arg0 - arg1;
        return result;
    }

    public double sub(double arg0, double arg1) {
        double result = arg0 - arg1;
        return result;
    }

    public int mul(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public double mul(double arg0, double arg1) {
        return arg0 * arg1;
    }

    public int div(int arg0, int arg1) {
        return arg0 / arg1;
    }


    public int res(int arg0, int arg1) {
        return arg0 % arg1;
    }

    public double div(double arg0, double arg1) {
        return arg0 / arg1;
    }

}
