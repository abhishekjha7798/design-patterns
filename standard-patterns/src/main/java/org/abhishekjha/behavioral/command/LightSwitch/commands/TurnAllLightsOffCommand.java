package org.abhishekjha.behavioral.command.LightSwitch.commands;

import org.abhishekjha.behavioral.command.LightSwitch.Light;

import java.util.List;

public class TurnAllLightsOffCommand implements Command {
    private final List<Light> lights;

    public TurnAllLightsOffCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            light.turnOff();
        }
    }
}
