package com.cfjofre.patterndesign.command;

public class CeilingFan {

    private String Name;

    public CeilingFan(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void on(){
        System.out.println("ceiling fan on");
    }

    public void off(){
        System.out.println("ceiling fan off");
    }
}
