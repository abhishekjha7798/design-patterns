package org.abhishekjha.behavioral.command.LightSwitch;

import org.abhishekjha.behavioral.command.LightSwitch.commands.Command;

public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
