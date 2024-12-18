package com.cfjofre.patterndesign.command;

public class Light {

    private String Name;

    public Light(String name) {
        Name = name;
    }

    public void on() {
        System.out.println("light on");
    };

    public void off() {
        System.out.println("light off");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    };

}
