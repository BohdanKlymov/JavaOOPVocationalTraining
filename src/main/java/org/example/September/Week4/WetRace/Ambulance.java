package org.example.September.Week4.WetRace;

public class Ambulance extends Car{
    private boolean blueLight;

    public Ambulance(double position, double speed) {
        super(position, speed);
        this.blueLight = false;
    }

    public void TurnBlueLightOn() {
        blueLight = true;
    }

    public void TurnBlueLightOff() {
        blueLight = false;
    }
}
