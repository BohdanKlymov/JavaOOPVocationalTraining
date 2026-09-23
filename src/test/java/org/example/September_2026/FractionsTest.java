package org.example.September_2026;

import org.junit.jupiter.api.Test;
import org.example.September_2026.Week4.Fractions.Fractions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FractionsTest {

    @Test
    void testKonstruktor() {
        Fractions fraction = new Fractions(3, 4);

        assertTrue(3 == fraction.getCounter());
        assertTrue(4 == fraction.getDenominator());
    }

    @Test
    void testToString() {
        Fractions fraction = new Fractions(3, 4);

        assertEquals("3/4", fraction.toString());
    }

}
