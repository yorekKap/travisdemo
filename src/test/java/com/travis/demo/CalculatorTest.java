package com.travis.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void plusTest() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.plus(2, 2), 4);
    }
}