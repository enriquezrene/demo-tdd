package com.tddbyexample;

/**
 * Created by moe on 5/1/16.
 */
public class Dollar extends Money{

    public Dollar(int ammount, String currency) {
        super(ammount, currency);
    }

    public Money times(int multiplier) {
        return Money.dollar(amount *multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }

}
