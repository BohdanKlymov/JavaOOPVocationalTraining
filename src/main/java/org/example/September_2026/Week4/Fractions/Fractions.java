package org.example.September_2026.Week4.Fractions;

public class Fractions {
    private long counter;
    private long denominator;

    public Fractions(long counter, long denominator) {
        this.counter = counter;
        this.denominator = denominator;
    }

    public String toString() {
        return counter + "/" + denominator;
    }
}


