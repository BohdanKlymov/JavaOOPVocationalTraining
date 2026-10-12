package org.example.october.week1.planes;

public abstract class Airplane {
    private String manufacturer;
    private int maxSpeed;
    private String immatNummer;
    private int numberOfWings = 1;


//    Which of two constructors should I let here?

    public Airplane(String manufacturer, int maxSpeed) {
        this(manufacturer,maxSpeed,1);
    }

    public Airplane(String manufacturer, int maxSpeed, int numberOfWings) {
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.numberOfWings = 1;
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
