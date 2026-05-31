package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResultCalculatorTest {

    @Test
    public void testAddMarks() {

        ResultCalculator rc = new ResultCalculator();

        assertEquals(100, rc.addMarks(40, 60));

    }

}