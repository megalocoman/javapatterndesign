package com.cfjofre.patterndesign.command;

public class MacroCommandremotecontrol {

    public static void main(String[] args) {
        
        var remoteControl = new RemoteControlWithUndo();

        Light light = new Light(" Living room");
        Tv tv = new Tv("Living room");
        Stereo stereo = new Stereo("Living room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnCommand StereoOn = new StereoOnCommand(stereo);
        StereoOffCommand StereoOff = new StereoOffCommand(stereo);
        TvOnCommand tvOn = new TvOnCommand(tv);
        TvOffCommand tvOff = new TvOffCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, StereoOn, tvOn, hottubOn };
        Command[] partyOff = { lightOff, StereoOff, tvOff, hottubOff };

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnCommand, partyOffCommand);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);

    }

}
