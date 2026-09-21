package org.example.September_2026.Week3.SnakeGame;

public class PointForPosition {

    private int xPosition;
    private int yPosition;

    public PointForPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public double getX() {
        return xPosition;
    }

    public double getY() {
        return yPosition;
    }

    public void setLocation(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
}
