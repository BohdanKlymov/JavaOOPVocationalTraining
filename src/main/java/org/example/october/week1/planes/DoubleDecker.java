package org.example.october.week1.planes;

public class DoubleDecker extends Airplane{
    private int numberOfWings = 2;
    public static final int loopingSpeed = 320;
    private final boolean openedCockpid;

    public DoubleDecker(String manufacturer, int maxSpeed, String immatNumber, boolean openedCockpid) {
        super(manufacturer, maxSpeed);
        setImmatNummer(immatNumber);
        this.openedCockpid = openedCockpid;
    }

    public DoubleDecker(String manufacturer, int maxSpeed, String immatNumber) {
        this(manufacturer, maxSpeed, immatNumber, true);
    }

    @Override
    public boolean getLooping() {
        return true;
    }

    public boolean getOpenedCockpid() {
        return openedCockpid;
    }
}
