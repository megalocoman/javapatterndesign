package com.cfjofre.patterndesign.strategy;

public abstract class Duck {
    
    FlyBeheaviour flyBeheaviour;
    QuackBeheavoir quackBeheavoir;

    public Duck() {
    }

    public abstract void display();
    
    public void performFly(){
        flyBeheaviour.fly();
    }

    public void performQuack(){
        quackBeheavoir.quack();
    }

    public void swim(){
        System.out.println("all ducks flaots, even decoys");
    }

    public void setFlyBeheaviour(FlyBeheaviour flyBeheaviour) {
        this.flyBeheaviour = flyBeheaviour;
    }

    public void setQuackBeheavoir(QuackBeheavoir quackBeheavoir) {
        this.quackBeheavoir = quackBeheavoir;
    }
}
