package org.example.September_2026.Week4.WetRace;

public abstract class Vehicle {
    protected double position;
    protected double speed;


    protected double maxSpeed;
    protected double wheels;


    public Vehicle(double position, double speed, double maxSpeed, double wheels) {
        this.position = position;
        this.maxSpeed = maxSpeed;
        setSpeed(speed);
        this.wheels = wheels;
    }

    public void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    public double Move(double minutes) {

        if (minutes < 0) {
            minutes = 0;
        }

        double minutesInHours = minutes / 60;

        double distanceTravelled = speed * minutesInHours;

        distanceTravelled = Math.round(distanceTravelled * 10.0) / 10.0;

        return position += distanceTravelled;
    }
}


