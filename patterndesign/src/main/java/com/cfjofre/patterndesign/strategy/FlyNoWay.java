package com.cfjofre.patterndesign.strategy;

public class FlyNoWay implements FlyBeheaviour {

    @Override
    public void fly() {
      System.out.println("I can't fly!!");;
    }
    
}
