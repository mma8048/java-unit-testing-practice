package com.anas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Mansur Ashraf
 * @since 1/13/16
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        this.calculator = new Calculator();
    }


    @Test
    public void testAddition() {
        assertEquals("Incorrect result from adding two numbers", 2.0, calculator.add(1.0, 1.0), 0.0);
        assertEquals("Incorrect result from adding positive and negative numbers", 0.0, calculator.add(-1.0, 1.0), 0.0);
        assertEquals("Addition with 0 didnt not return correct result", 1.0, calculator.add(0, 1.0), 0.0);
        assertEquals("Addition with 0 didnt not return correct result", 1.0, calculator.add(1.0, 0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdditionBoundaries() {
        calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
    }

    // Please implement these
    @Test
    public void testSubtract() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {

    }

    @Test
    public void testDivide() throws Exception {

    }

    @Test
    public void testAddAll() throws Exception {

    }

    @Test
    public void testMultiplyAll() throws Exception {

    }

    @Test
    public void testMain() throws Exception {

    }
}
