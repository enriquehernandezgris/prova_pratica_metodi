////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

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
}