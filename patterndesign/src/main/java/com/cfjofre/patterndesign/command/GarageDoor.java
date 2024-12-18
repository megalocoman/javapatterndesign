package com.cfjofre.patterndesign.command;

public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("garage door up");
    }

    public void down() {
        System.out.println("garage door down");
    }

    public void stop() {
        System.out.println("garage door stop");
    }

    public void lightOn() {
        System.out.println("garage door light On");
    }

    public void lightDown() {
        System.out.println("garage door light Down");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
