////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
     // Errore limite inferiore
    @Test
    public void convert_NumberZero_ThrowsIllegalArgumentException() {
        int input = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        }, "Fail inferior limit");
    }

    // Errore limite negativo
    @Test
    public void convert_NegativeNumber_ThrowsIllegalArgumentException() {
        int input = -5;

        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        }, "Fail negative limit");
    }

    // Errore limite superiore
    @Test
    public void convert_Thousandandone_ThrowsIllegalArgumentException() {
        int input = 1001;

        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        }, "Fail superior limit");
    }


    //Tests
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

    @Test
    public void convert_NumbersFifteenToCorrectRomanSymbols() {
        assertEquals("XV", IntegerToRoman.convert(15), "Fail converting 15");
    }

    @Test
    public void convert_NumbersNineteenToCorrectRomanSymbols() {
        assertEquals("XIX", IntegerToRoman.convert(19), "Fail converting 19");
    }

    @Test
    public void convert_NumbersTwentyToCorrectRomanSymbols() {
        assertEquals("XX", IntegerToRoman.convert(20), "Fail converting 20");
    }

    @Test
    public void convert_NumbersThirtyToCorrectRomanSymbols() {
        assertEquals("XXX", IntegerToRoman.convert(30), "Fail converting 30");
    }

    @Test
    public void convert_NumbersFortyToCorrectRomanSymbols() {
        assertEquals("XL", IntegerToRoman.convert(40), "Fail converting 40");
    }

    @Test
    public void convert_NumbersFiftyToCorrectRomanSymbols() {
        assertEquals("L", IntegerToRoman.convert(50), "Fail converting 50");
    }

    @Test
    public void convert_NumbersSixtyToCorrectRomanSymbols() {
        assertEquals("LX", IntegerToRoman.convert(60), "Fail converting 60");
    }

    @Test
    public void convert_NumbersSeventyToCorrectRomanSymbols() {
        assertEquals("LXX", IntegerToRoman.convert(70), "Fail converting 70");
    }

    @Test
    public void convert_NumbersEightyToCorrectRomanSymbols() {
        assertEquals("LXXX", IntegerToRoman.convert(80), "Fail converting 80");
    }

    @Test
    public void convert_NumbersNinetyToCorrectRomanSymbols() {
        assertEquals("XC", IntegerToRoman.convert(90), "Fail converting 90");
    }

    @Test
    public void convert_NumbersOneHundredToCorrectRomanSymbols() {
        assertEquals("C", IntegerToRoman.convert(100), "Fail converting 100");
    }

    @Test
    public void convert_NumbersTwoHundredToCorrectRomanSymbols() {
        assertEquals("CC", IntegerToRoman.convert(200), "Fail converting 200");
    }

    @Test
    public void convert_NumbersThreeHundredToCorrectRomanSymbols() {
        assertEquals("CCC", IntegerToRoman.convert(300), "Fail converting 300");
    }

    @Test
    public void convert_NumbersFourHundredToCorrectRomanSymbols() {
        assertEquals("CD", IntegerToRoman.convert(400), "Fail converting 400");
    }

    @Test
    public void convert_NumbersFiveHundredToCorrectRomanSymbols() {
        assertEquals("D", IntegerToRoman.convert(500), "Fail converting 500");
    }   
}