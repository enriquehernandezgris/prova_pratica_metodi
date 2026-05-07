////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    @Test
    public void print_NumberFour_ReturnsAsciiArtI() {
        assertEquals(" _____    __      __\n|_   _|   \\ \\    / /\n  | |      \\ \\  / / \n  | |       \\ \\/ /  \n _| |_       \\  /   \n|_____|       \\/    ", RomanPrinter.print(4));
    }

    @Test
    public void print_NumberFive_ReturnsAsciiArtI() {
        assertEquals("__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    ", RomanPrinter.print(5));
    }

    @Test
    public void print_NumberSix_ReturnsAsciiArtI() {
        assertEquals("__      __    _____ \n\\ \\    / /   |_   _|\n \\ \\  / /      | |  \n  \\ \\/ /       | |  \n   \\  /       _| |_ \n    \\/       |_____|", RomanPrinter.print(6));
    }
}
