package com.cfjofre.patterndesign.command;

public interface Command {
    public void execute();
    public void undo();
}
