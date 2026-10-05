package org.example.September_2026.Week4.WetRace;

public class Car extends Vehicle{

    public Car(double position, double speed) {
        super(position, speed, 140, 4);
    }

    protected Car(double position, double speed, double maxSpeed) {
        super(position, speed, maxSpeed, 4);
    }
}
