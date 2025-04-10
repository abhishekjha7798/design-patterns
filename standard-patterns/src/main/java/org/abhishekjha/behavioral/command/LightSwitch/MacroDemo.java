package org.abhishekjha.behavioral.command.LightSwitch;

import org.abhishekjha.behavioral.command.LightSwitch.commands.Command;
import org.abhishekjha.behavioral.command.LightSwitch.commands.ToggleCommand;
import org.abhishekjha.behavioral.command.LightSwitch.commands.TurnAllLightsOffCommand;

import java.util.List;

public class MacroDemo {
    public static void main(String[] args) {
        // Create lights
        Light bedroomLight = new Light("Bedroom Light");
        Light kitchenLight = new Light("Kitchen Light");
        List<Light> lights = List.of(bedroomLight, kitchenLight);

        // Create commands
        Command toggleBedRoomLight = new ToggleCommand(bedroomLight);
        Command toggleKitchenLight = new ToggleCommand(kitchenLight);
        Command turnAllLightsOffCommand = new TurnAllLightsOffCommand(lights);

        // Create a switch
        Switch lightSwitch = new Switch();

        // Execute commands
        lightSwitch.storeAndExecute(toggleBedRoomLight);
        lightSwitch.storeAndExecute(toggleKitchenLight);
        lightSwitch.storeAndExecute(turnAllLightsOffCommand);
    }
}
