package com.tddbyexample;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by moe on 5/1/16.
 */
public class MoneyCalculator {

    @Test
    public void testMultiplication() throws Exception {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.ammount);

    }
}
