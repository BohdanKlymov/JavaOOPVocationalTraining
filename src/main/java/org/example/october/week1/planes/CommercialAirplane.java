package org.example.october.week1.planes;

class CommercialAirplane extends Airplane {
    private String amountOfPassengers;

    public CommercialAirplane(String manufacturer, int maxSpeed, String immatNumber, String numberOfPassengers) {
        super(manufacturer, maxSpeed);
        this.amountOfPassengers = numberOfPassengers;
        setImmatNummer(immatNumber);
    }

    @Override
    public final boolean getLooping() {
        return false;
    }

    public String getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers() {
        this.amountOfPassengers = amountOfPassengers;
    }
}
