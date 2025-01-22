package com.cfjofre.patterndesign.state.noPatternImpl;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case HAS_QUARTER -> System.out.println("you cant insert another quarter");
            case NO_QUARTER -> {
                state = HAS_QUARTER;
                System.out.println("You can insert a quarter");
            } 
            case SOLD_OUT -> System.out.println("you cant insert a quarter, the machine is sold out");
            case SOLD -> System.out.println("Please wait, we're already gave a gumball");
            default -> throw new RuntimeException("not valid option");
        }
    }

    public void turnCrank() {
        switch (state) {
            case SOLD -> System.out.println("Turning twice doesn’t get you another gumball!");
            case NO_QUARTER -> System.out.println("You turned but there’s no quarter");
            case SOLD_OUT -> System.out.println("You turned, but there are no gumballs");
            case HAS_QUARTER -> {
                System.out.println("You turned...");
                state = SOLD;
                dispense();
            }
            default -> throw new RuntimeException("not valid option");
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER -> {
                System.out.println("Quarter returned");
                state = NO_QUARTER;
            }
            case NO_QUARTER -> System.out.println("You haven’t inserted a quarter");
            case SOLD -> System.out.println("Sorry, you already turned the crank");
            case SOLD_OUT -> System.out.println("You can’t eject, you haven’t inserted a quarter yet");
            default -> throw new RuntimeException("not valid option");
        }
    }

    public void dispense() {
        switch (state) {
            case SOLD -> {
                System.out.println("A gumball comes rolling out the slot");
                count = count - 1;
                if (count == 0) {
                    System.out.println("Opps, out of gumballs");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUARTER;
                }
            }
            case NO_QUARTER -> System.out.println("You need to pay first");
            case SOLD_OUT -> System.out.println("No gumball dispensed");
            case HAS_QUARTER -> System.out.println("No gumball dispensed");
            default -> throw new RuntimeException("not valid option");
        }
    }

    public String toString(){
            return "number of gumball = " + this.count;
    }
}
