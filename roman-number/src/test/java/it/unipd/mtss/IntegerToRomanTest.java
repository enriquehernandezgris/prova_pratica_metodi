////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void convert_NumbersSevenToCorrectRomanSymbols() {
        assertEquals("VII", IntegerToRoman.convert(7), "Fail converting 7");
    }

    @Test
    public void convert_NumbersEightToCorrectRomanSymbols() {
        assertEquals("VIII", IntegerToRoman.convert(8), "Fail converting 8");
    }

    @Test
    public void convert_NumbersNineToCorrectRomanSymbols() {
        assertEquals("IX", IntegerToRoman.convert(9), "Fail converting 9");
    }

    @Test
    public void convert_NumbersTenToCorrectRomanSymbols() {
        assertEquals("X", IntegerToRoman.convert(9), "Fail converting 10");
    }
}