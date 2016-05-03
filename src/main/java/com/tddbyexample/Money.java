package com.tddbyexample;

/**
 * Created by moe on 5/2/16.
 */
public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount =amount;
        this.currency=currency;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return (amount == money.amount && getClass().equals(obj.getClass()));
    }

    abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public abstract String currency();
}
