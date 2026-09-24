package org.example.September_2026;

import org.junit.jupiter.api.Test;
import org.example.September_2026.Week4.Fractions.Fractions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FractionsTest {

    @Test
    void konstruktorTest() {
        Fractions fraction = new Fractions(3, 4);

        assertTrue(3 == fraction.getCounter());
        assertTrue(4 == fraction.getDenominator());
    }

    @Test
    void toStringTest() {
        Fractions fraction = new Fractions(3, 4);

        assertEquals("3/4", fraction.toString());
    }

    @Test
    void multiplyByTest() {
        Fractions fraction = new Fractions(3, 4);

        Fractions result = fraction.multiplyBy(fraction);

        assertEquals("9/16", result.toString());
    }

    @Test
    void divideByTest() {
        Fractions fraction1 = new Fractions(3, 4);
        Fractions fraction2 = new Fractions(4, 5);

       fraction1.divideBy(fraction2);

        assertEquals("15/16", fraction1.toString());
    }

    @Test
    void addThisTest3And4Plus1And3() {
        Fractions fraction = new Fractions(3, 4);
        Fractions fraction2 = new Fractions(1, 3);

        fraction.addThis(fraction2);

        assertEquals("13/12", fraction.toString());
    }

    @Test
    void addThisTest12And2Plus4And7() {
        Fractions fraction = new Fractions(12, 2);
        Fractions fraction2 = new Fractions(4, 7);

        fraction.addThis(fraction2);

        assertEquals("92/14", fraction.toString());
    }

//    @Test
//    void subtractFromThatTest() {
//        Fractions fraction = new Fractions(3, 4);
//
//        Fractions result = fraction.subtractFromThat(fraction);
//
//        assertEquals("0/0", result.toString());
//    }

    @Test
    void addZwoFractionsTest() {
        Fractions firstFraction = new Fractions(3, 4);
        Fractions secondFraction = new Fractions(12, 5);

        Fractions result = Fractions.addTwoFractions(firstFraction, secondFraction);

        assertEquals("15/9", result.toString());
    }
}
