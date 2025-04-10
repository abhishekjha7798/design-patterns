package org.abhishekjha.behavioral.command.LightSwitch;

import org.abhishekjha.behavioral.command.LightSwitch.commands.Command;
import org.abhishekjha.behavioral.command.LightSwitch.commands.ToggleCommand;
import org.abhishekjha.behavioral.command.LightSwitch.commands.TurnOnCommand;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light("Light");
        Switch lightSwitch = new Switch();

        Command turnOnCommand = new TurnOnCommand(light);

        lightSwitch.storeAndExecute(turnOnCommand);

        Command toggleCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
    }
}
