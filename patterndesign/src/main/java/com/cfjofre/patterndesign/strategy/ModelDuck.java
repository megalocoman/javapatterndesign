package com.cfjofre.patterndesign.strategy;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBeheaviour = new FlyNoWay();
        quackBeheavoir = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i'm a model duck");
    }
    
}
