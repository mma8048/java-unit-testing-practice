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
        assertEquals(2.0, calculator.add(1.0, 1.0), 0.0);
        assertEquals(0.0, calculator.add(-1.0, 1.0), 0.0);
        assertEquals(1.0, calculator.add(0, 1.0), 0.0);
        assertEquals(1.0, calculator.add(1.0, 0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdditionBoundaries() {
        calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
    }


}
