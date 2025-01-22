package com.cfjofre.patterndesign.proxy;

public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("not price yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("not price yet");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("not price yet");
    }

    @Override
    public void dispense() {
        
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("opps , we are out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }

    }

}
