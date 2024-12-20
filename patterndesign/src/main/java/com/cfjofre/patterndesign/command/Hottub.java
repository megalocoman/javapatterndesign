package com.cfjofre.patterndesign.command;

public class Hottub {

    private String name;

    public Hottub(String name) {
        this.name = name;
    }

    public Hottub() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("hottub is on ....");
    }

    public void off() {
        System.out.println("hottub is off...");
    }

}
