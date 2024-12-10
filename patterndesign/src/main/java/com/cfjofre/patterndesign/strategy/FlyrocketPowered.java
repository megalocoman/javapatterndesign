package com.cfjofre.patterndesign.strategy;

public class FlyrocketPowered implements FlyBeheaviour{

    @Override
    public void fly() {
        System.out.println("i'm flying in a rocket!!!");
    }

}