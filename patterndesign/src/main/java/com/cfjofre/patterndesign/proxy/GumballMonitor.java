package com.cfjofre.patterndesign.proxy;

public class GumballMonitor {
    
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){
        System.out.println("gumball machine : "+ machine.location );
        System.out.println("current inventory: " +machine.getCount() + " gumballs.");
        System.out.println("current state :"+ machine.getState() );
    }
}
