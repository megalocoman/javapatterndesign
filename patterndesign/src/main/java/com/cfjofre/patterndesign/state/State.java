package com.cfjofre.patterndesign.state;

public interface State {
    
    public void insertQuarter();
    public void turnCrank();
    public void ejectQuarter();
    public void dispense();

}
