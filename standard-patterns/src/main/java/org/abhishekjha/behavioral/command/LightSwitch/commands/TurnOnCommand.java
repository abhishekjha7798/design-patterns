package org.abhishekjha.behavioral.command.LightSwitch.commands;

import org.abhishekjha.behavioral.command.LightSwitch.Light;

// concrete command
public class TurnOnCommand implements Command {
    private final Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
