package com.tddbyexample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by moe on 5/1/16.
 */
public class MoneyCalculator {

    @Test
    public void testEquality() throws Exception {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    public void testMultiplication() throws Exception {

        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
}
