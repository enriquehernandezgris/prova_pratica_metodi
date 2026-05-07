////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        assertEquals("""
                 _____
                |_   _|
                  | |
                  | |
                 _| |_
                |_____|""", RomanPrinter.print(1));
        assertEquals("""
                 _____   _____
                |_   _| |_   _|
                  | |     | |
                  | |     | |
                 _| |_   _| |_
                |_____| |_____|""", RomanPrinter.print(2));
        assertEquals("""
                 _____   _____   _____
                |_   _| |_   _| |_   _|
                  | |     | |     | |
                  | |     | |     | |
                 _| |_   _| |_   _| |_
                |_____| |_____| |_____|""", RomanPrinter.print(3));
    }
}

