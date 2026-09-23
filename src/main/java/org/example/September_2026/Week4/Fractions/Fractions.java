package org.example.September_2026.Week4.Fractions;

public class Fractions {
    private long counter;
    private long denominator;

    public Fractions(long counter, long denominator) {
        this.counter = counter;
        this.denominator = denominator;
    }

    public long getCounter() {
        return counter;
    }

    public long getDenominator() {
        return denominator;
    }

    public String toString() {
        return counter + "/" + denominator;
    }

    public Fractions multiplyBy(Fractions other) {
        return new Fractions(
                this.counter * other.counter,
                this.denominator * other.denominator
        );
    }

    public Fractions divideBy(Fractions other) {
        return new Fractions(
                this.counter * other.denominator,
                this.denominator * other.counter
        );
    }

    public Fractions addiereDazu(Fractions other) {
        return new Fractions(
                this.counter * other.denominator
                        + other.counter * this.denominator,
                this.denominator * other.denominator
        );
    }

    public Fractions subtractFromThat(Fractions other) {
        return new Fractions(
                this.counter * other.denominator
                        - other.counter * this.denominator,
                this.denominator * other.denominator
        );
    }
}


