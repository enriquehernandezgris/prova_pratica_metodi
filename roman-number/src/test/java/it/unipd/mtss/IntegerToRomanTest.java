////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    @Test
    public void convert_NumbersOneToCorrectRomanSymbols() {
        assertEquals("I", IntegerToRoman.convert(1), "Fail converting 1");
    }

    @Test
    public void convert_NumbersTwoToCorrectRomanSymbols() {
        assertEquals("II", IntegerToRoman.convert(2), "Fail converting 2");
    }

    @Test
    public void convert_NumbersThreeToCorrectRomanSymbols() {
        assertEquals("III", IntegerToRoman.convert(3), "Fail converting 3");
    }

    @Test
    public void convert_NumbersFourToCorrectRomanSymbols() {
        assertEquals("IV", IntegerToRoman.convert(4), "Fail converting 4");
    }

    @Test
    public void convert_NumbersFiveToCorrectRomanSymbols() {
        assertEquals("V", IntegerToRoman.convert(5), "Fail converting 5");
    }

    @Test
    public void convert_NumbersSixToCorrectRomanSymbols() {
        assertEquals("VI", IntegerToRoman.convert(6), "Fail converting 6");
    }

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
        assertEquals("X", IntegerToRoman.convert(10), "Fail converting 10");
    }
}







