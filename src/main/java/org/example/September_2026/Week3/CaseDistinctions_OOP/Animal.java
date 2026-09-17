package org.example.September_2026.Week3.CaseDistinctions_OOP;

import java.util.Objects;

public class Animal {
    private int legs;
    private boolean airworthy;
    private boolean hasFeathers;
    private String isDangerousForPeople;

    public Animal(int legs, boolean airworthy, boolean hasFeathers, String isDangerousForPeople) {
        this.legs =  legs;
        this.airworthy = airworthy;
        this.hasFeathers = hasFeathers;
        this.isDangerousForPeople = isDangerousForPeople;
    }

    public void printInformation() {
        System.out.println("Legs: " + legs);
        System.out.println("airworthy: " + airworthy);
        System.out.println("hasFeathers: " + hasFeathers);
        System.out.println("isDangerousForPeople: " + isDangerousForPeople);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return legs == animal.legs && airworthy == animal.airworthy && hasFeathers == animal.hasFeathers && Objects.equals(isDangerousForPeople, animal.isDangerousForPeople);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs, airworthy, hasFeathers, isDangerousForPeople);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", airworthy=" + airworthy +
                ", hasFeathers=" + hasFeathers +
                ", isDangerousForPeople='" + isDangerousForPeople + '\'' +
                '}';
    }
}
