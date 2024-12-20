package com.cfjofre.patterndesign.command;

public class Tv {
    private String Name;

    public Tv(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void on(){
        System.out.println("tv is on...");
    }

    public void off(){
        System.out.println("tv is off...");
    }
}
