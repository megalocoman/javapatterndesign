package com.cfjofre.patterndesign.command;

public class GarageDoorDownCommand implements Command{
    GarageDoor garageDoor;
    
    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
      garageDoor.down();
      garageDoor.lightDown();
    }

    @Override
    public void undo() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'undo'");
    }

}
