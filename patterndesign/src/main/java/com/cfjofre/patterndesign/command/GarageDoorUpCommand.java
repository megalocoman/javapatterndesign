package com.cfjofre.patterndesign.command;

public class GarageDoorUpCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
        garageDoor.up();
    }
    


}
