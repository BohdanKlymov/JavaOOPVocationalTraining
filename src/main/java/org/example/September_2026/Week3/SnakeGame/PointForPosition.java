package org.example.September_2026.Week3.SnakeGame;

import java.awt.*;

public class PointForPosition {

    public int xPosition;
    public int yPosition;

    public PointForPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void setLocation(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PointForPosition) {
            PointForPosition pt = (PointForPosition)obj;
            return (xPosition == pt.xPosition) && (yPosition == pt.yPosition);
        }
        return false;
    }
}
