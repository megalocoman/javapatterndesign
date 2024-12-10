package com.cfjofre.patterndesign.strategy;

public class Main {
    public static void main(String[] args) {

        Duck mallarDuck = new MallardDuck();

        mallarDuck.performFly();
        mallarDuck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBeheaviour(new FlyrocketPowered());
        model.performFly();
     
         
    }
}