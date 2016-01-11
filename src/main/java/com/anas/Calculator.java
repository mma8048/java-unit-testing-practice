package com.anas;

/*
 * @author Mansur Ashraf
 * @since 1/8/16
 */


import java.util.List;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }


    /*
     * rule 1 => b cannot be 0
     * rule 2  must return int
     *
     * @param a
     * @param b
     * @return
     */

    public int divide(int a, int b) {
        return a / b;
    }

    public int addAll(List input){

    }


    public int multiplyAll(List input){

    }

    public static void main(String[] args) {
        final Calculator calculator = new Calculator();

        System.out.println("2 + 2 = " + calculator.add(2, 2));
       System.out.println("2 - 2 = " + calculator.subtract(2, 2));
        System.out.println("2 * 2 = " + calculator.multiply(2, 2));
        System.out.println("2 divided by 2 = " + calculator.divide(2, 2));
    }
}
