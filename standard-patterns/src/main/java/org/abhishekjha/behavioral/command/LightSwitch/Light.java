package org.abhishekjha.behavioral.command.LightSwitch;

// Receiver class
public class Light {
    private final String name;
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    public void toggle() {
        if (isOn) {
            turnOff();
        } else {
            turnOn();
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Turning on " + name);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Turning off " + name);
    }
}
