package com.anas;

/*
 * @author Mansur Ashraf
 * @since 1/8/16
 */

/*Imported from Java Library*/
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    /*int is changed to float to enable decimal numbers*/
    public double add(double a, double b) {
        if (a == Double.MAX_VALUE || b == Double.MAX_VALUE) {
            throw new IllegalArgumentException("a or b cannot be equal to " + Double.MAX_VALUE);
        }
        final double result = a + b;
        return result;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }



    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b cannot be null");
        }

        return a / b;
    }

    public int addAll(List input){
        int result = 0;
        for (int i = 0; i < input.size(); i++) {
            result += (Integer)input.get(i);
        }
        return result;
    }


    public int multiplyAll(List input){
        int result = 1;
        for (int i = 0; i < input.size(); i++) {
            result *= (Integer)input.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        final Calculator calculator = new Calculator();

        System.out.println("2 + 2 = " + calculator.add(2.3f, 2.3f));
        System.out.println("2 - 2 = " + calculator.subtract(2.6f, 2.4f));
        System.out.println("2 * 2 = " + calculator.multiply(2.6f, 2.2f));
        System.out.println("2 divided by 2 = " + calculator.divide(2, 0));

        List<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        System.out.println("Sum of all numbers =  " + calculator.addAll(numbersList));
        System.out.println("Product of all numbers =  " + calculator.multiplyAll(numbersList));

    }
}
