package com.cfjofre.patterndesign.strategy;

public class MallardDuck extends Duck {

    
    public  MallardDuck() {
      quackBeheavoir = new Quack();
      flyBeheaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("Im a real Mallard duck");
    }
    
}
