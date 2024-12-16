package com.cfjofre.patterndesign.simplefactory;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {

    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    @Override
    void prepare() {
    
        throw new UnsupportedOperationException("Unimplemented method 'prepare'");
    }

}
