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
        Fractions fraction1 = new Fractions(5, 6);
        Fractions fraction2 = new Fractions(2, 5);

        fraction1.multiplyBy(fraction2);

        assertEquals("1/3", fraction1.toString());
    }

    @Test
    void divideByTest3And4Divided4And5ShouldBe15And16() {
        Fractions fraction1 = new Fractions(3, 4);
        Fractions fraction2 = new Fractions(4, 5);

       fraction1.divideBy(fraction2);

        assertEquals("15/16", fraction1.toString());
    }

    @Test
    void divideByTest6And8Divided8And6ShouldBe9And16() {
        Fractions fraction1 = new Fractions(6, 8);
        Fractions fraction2 = new Fractions(8, 6);

        fraction1.divideBy(fraction2);

        assertEquals("9/16", fraction1.toString());
    }

    @Test
    void addThisTest3And4Plus1And3ShouldBe13And12() {
        Fractions fraction = new Fractions(3, 4);
        Fractions fraction2 = new Fractions(1, 3);

        Fractions result = fraction.addThis(fraction2);

        assertEquals("13/12", result.toString());
    }

    @Test
    void addThisTest12And2Plus4And7ShouldBe46And7() {
        Fractions fraction = new Fractions(12, 2);
        Fractions fraction2 = new Fractions(4, 7);

        Fractions result = fraction.addThis(fraction2);

        assertEquals("46/7", result.toString());
    }

    @Test
    void subtractFromThatTest2And5Minus4And3ShouldBeMinus14And15() {
        Fractions fraction = new Fractions(2, 5);
        Fractions fraction2 = new Fractions(4, 3);

        Fractions result = fraction.subtractFromThat(fraction2);

        assertEquals("-14/15", result.toString());
    }

    @Test
    void addThisTest7And10Minus1And5ShouldBe4And5() {
        Fractions fraction = new Fractions(7, 10);
        Fractions fraction2 = new Fractions(1, 5);

        Fractions result = fraction.subtractFromThat(fraction2);

        assertEquals("1/2", result.toString());
    }

    @Test
    void addZwoFractionsTest() {
        Fractions firstFraction = new Fractions(3, 4);
        Fractions secondFraction = new Fractions(12, 5);

        Fractions result = Fractions.addTwoFractions(firstFraction, secondFraction);

        assertEquals("63/20", result.toString());
    }

    @Test
    void shortenFractionsTest() {
        Fractions fraction = new Fractions(48, 18);

        Fractions result = Fractions.shortenFractions(fraction);

        assertEquals("8/3", result.toString());
    }

    @Test
    void equalsTest24And48Equals2And4() {
        Fractions firstFraction = new Fractions(24, 48);
        Fractions secondFraction = new Fractions(2, 4);

        assertEquals(true, Fractions.equalFractions(firstFraction, secondFraction));
    }
}
