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

    public void multiplyBy(Fractions other) {
                this.counter *= other.counter;
                this.denominator *= other.denominator;

                Fractions result = shortenFractions(new Fractions(this.counter, this.denominator));

                this.counter = result.counter;
                this.denominator = result.denominator;
    }

    public void divideBy(Fractions other) {

        this.counter *= other.denominator;
        this.denominator *= other.counter;

        Fractions result = shortenFractions(new Fractions(this.counter, this.denominator));

        this.counter = result.counter;
        this.denominator = result.denominator;

    }

    public Fractions addThis(Fractions other) {

        long newCounter = this.counter * other.denominator + other.counter * this.denominator;

        long newDenominator = this.denominator * other.denominator;

        return shortenFractions(new Fractions(newCounter, newDenominator));
    }

    public Fractions subtractFromThat(Fractions other) {

        Fractions fractions = shortenFractions(other);

        long newCounter = this.counter * fractions.denominator - fractions.counter * this.denominator;

        long newDenominator = this.denominator * fractions.denominator;

        return shortenFractions(new Fractions(newCounter, newDenominator));
    }

    public static Fractions addTwoFractions(Fractions firstFraction, Fractions secondFraction) {
        long newCounter =
                firstFraction.counter * secondFraction.denominator
                        + secondFraction.counter * firstFraction.denominator;

        long newDenominator =
                firstFraction.denominator * secondFraction.denominator;

        return new Fractions(newCounter, newDenominator);
    }

    public static Fractions shortenFractions(Fractions fraction) {
        long newCounter = fraction.counter;
        long newDenominator = fraction.denominator;


        while (newDenominator != 0) {
            long copyOfNewCounter = newDenominator;

            newDenominator = newCounter % newDenominator;

            newCounter = copyOfNewCounter;
        }

        long shortedCounter = fraction.counter / newCounter;
        long shortedDenominator = fraction.denominator / newCounter;

        return new Fractions(shortedCounter, shortedDenominator);
    }

    public static boolean equalFractions(Fractions firstFraction, Fractions secondFraction) {
        Fractions firstShortedFraction = shortenFractions(firstFraction);
        Fractions secondShortedFraction = shortenFractions(secondFraction);

        if (firstShortedFraction.counter == secondShortedFraction.counter && firstShortedFraction.denominator == secondShortedFraction.denominator) {
            return true;
        }
        return false;
    }
}


