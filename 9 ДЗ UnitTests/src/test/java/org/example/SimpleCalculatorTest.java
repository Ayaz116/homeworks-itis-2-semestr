package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    @Test
    public void twoPlusTwoEqualsFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void onePlusOneEqualsTwo(){
        var calculator = new SimpleCalculator();
        assertEquals(2, calculator.add(1, 1));
    }

}