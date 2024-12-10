package com.cfjofre.patterndesign.strategy;

public class Squeak implements QuackBeheavoir{

    @Override
    public void quack() {
      System.out.println("Squeak");
    }
    
}
