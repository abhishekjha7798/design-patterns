package org.abhishekjha.behavioral.command.LightSwitch.commands;

import org.abhishekjha.behavioral.command.LightSwitch.Light;

public class ToggleCommand implements Command {
    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
