package com.tddbyexample;

/**
 * Created by moe on 5/1/16.
 */
public class Dollar {

    private int ammount;

    public Dollar(int ammount) {
        this.ammount = ammount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(ammount * multiplier);
    }


    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar)obj;
        return ammount == dollar.ammount;
    }
}
