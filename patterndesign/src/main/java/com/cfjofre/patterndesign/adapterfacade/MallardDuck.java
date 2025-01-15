package com.cfjofre.patterndesign.adapterfacade;

public class MallardDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("quack quack");
    }

    @Override
    public void quack() {
        System.out.println("im flying");
    }

}
