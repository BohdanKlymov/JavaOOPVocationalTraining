package org.example.September_2026.October.Week1.Planes;

public abstract class Airplanes {
    private String manufacturer;
    private int maxSpeed;
    private String immatNummer;
    private int numberOfWings = 1;

    public Airplanes(String manufacturer, int maxSpeed, int numberOfWings) {
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.numberOfWings = numberOfWings;
    }

    public String getImmatNummer() {
        return immatNummer;
    }

    protected void setImmatNummer(String immatNummer) {
        this.immatNummer = immatNummer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    abstract public boolean getLooping();
}
