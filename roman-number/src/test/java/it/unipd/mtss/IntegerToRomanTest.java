////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void convert_NumbersOneToThree_ReturnCorrectRomanSymbols() {
        assertEquals("I", IntegerToRoman.convert(1), "Fail converting 1");

        assertEquals("II", IntegerToRoman.convert(2), "Fail converting 2");

        assertEquals("III", IntegerToRoman.convert(3), "Fail converting 3");
    }


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
}