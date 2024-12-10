package com.cfjofre.patterndesign.strategy;

public class Quack implements QuackBeheavoir {

    @Override
    public void quack() {
        System.out.println("Quacks");
    }
    
}
