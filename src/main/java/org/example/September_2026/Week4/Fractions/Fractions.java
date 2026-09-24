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

    public void divideBy(Fractions other) {

        this.counter *= other.denominator;
        this.denominator *= other.counter;

    }

    public Fractions addThis(Fractions other) {

        long thisCounterCopyForMultiplication = this.counter;
        long otherCounterCopyForMultiplication = other.counter;

        long thisDenominatorCopyForMultiplication = this.denominator;
        long otherDenominatorCopyForMultiplication = other.denominator;

        long otherDenominator = other.denominator;
        long otherCounter = other.counter;

        boolean running = true;

        while(running) {
            if (this.denominator == otherDenominator) {
                running = false;
                return new Fractions(this.counter += otherCounter, this.denominator);
            } else {
                if (this.denominator < otherDenominator) {
                    this.denominator += thisDenominatorCopyForMultiplication;
                    this.counter += thisCounterCopyForMultiplication;
                } else {
                    otherDenominator += otherDenominatorCopyForMultiplication;
                    otherCounter += otherCounterCopyForMultiplication;
                }
            }
        }
        return null;
    }

    public void subtractFromThat(Fractions other) {
        this.counter =- other.counter;
        this.denominator =- other.denominator;
    }

    public static Fractions addTwoFractions(Fractions firstFraction, Fractions secondFraction) {
        return new Fractions(
            firstFraction.counter + secondFraction.counter,
            firstFraction.denominator + secondFraction.denominator
        );
    }
}


