package com.anas;

/*
 * @author Mansur Ashraf
 * @since 1/8/16
 */

/*Imported from Java Library*/
import java.util.List;

public class Calculator {

    /*int is changed to float to enable decimal numbers*/
    public float add(float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }
    public float multiply(float a, float b) {
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

    public float divide(float a, float b) {
        if(b == 0) {
            System.out.println("b cannot be 0 please enter another value");
            return -1;
        }
        else {
            return a / b;
        }
    }

    public int addAll(List input){

        return -1;

    }


    public int multiplyAll(List input){

        return -1;

    }

    public static void main(String[] args) {
        final Calculator calculator = new Calculator();

        System.out.println("2 + 2 = " + calculator.add(2.3f, 2.3f));
        System.out.println("2 - 2 = " + calculator.subtract(2.6f, 2.4f));
        System.out.println("2 * 2 = " + calculator.multiply(2.6f, 2.2f));
        /*System.out.println("2 divided by 2 = " + calculator.divide(2, 0)); */

        /* Storing divide in a variable so that we can control it later however we want using if/else conditions */
        float result = calculator.divide(2.5f, 0.0f);
        System.out.println("2 divided by 2 = " + result);
    }
}
