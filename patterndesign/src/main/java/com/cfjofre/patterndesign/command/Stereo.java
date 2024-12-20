package com.cfjofre.patterndesign.command;

public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("setting Cd...");
    }

    public void setDvd() {
        System.out.println("stting DVD...");
    }

    public void setRadio() {
        System.out.println("setting radio");
    }

    public void setVolume(int volume) {
        System.out.println("setting volume at " + volume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
