package com.tddbyexample;

/**
 * Created by moe on 5/2/16.
 */
public class Franc extends Money{

    public Franc(int ammount, String currency) {
        super(ammount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }

}
