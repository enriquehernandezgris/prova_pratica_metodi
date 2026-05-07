////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|", RomanPrinter.print(1));
        assertEquals(" _____     _____ \n|_   _|   |_   _|\n  | |       | |  \n  | |       | |  \n _| |_     _| |_ \n|_____|   |_____|", RomanPrinter.print(2));
        assertEquals(" _____     _____     _____ \n|_   _|   |_   _|   |_   _|\n  | |       | |       | |  \n  | |       | |       | |  \n _| |_     _| |_     _| |_ \n|_____|   |_____|   |_____|", RomanPrinter.print(3));
    }
}
