////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
     @Test
    public void print_NumberOne_ReturnsAsciiArtI() {
        assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|", RomanPrinter.print(1));
    }

     @Test
    public void print_NumberTwo_ReturnsAsciiArtI() {
        assertEquals(" _____     _____ \n|_   _|   |_   _|\n  | |       | |  \n  | |       | |  \n _| |_     _| |_ \n|_____|   |_____|", RomanPrinter.print(2));
    }

     @Test
    public void print_NumberThree_ReturnsAsciiArtI() {
        assertEquals(" _____     _____     _____ \n|_   _|   |_   _|   |_   _|\n  | |       | |       | |  \n  | |       | |       | |  \n _| |_     _| |_     _| |_ \n|_____|   |_____|   |_____|", RomanPrinter.print(3));
    }

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
        assertEquals("__      __    _____ \n\\ \\    / /   |_   _|\n \\ \\  / /      | |  \n  \\ \\/ /       | |  \n   \\  /       _| |_ \n    \\/       |_____|", RomanPrinter.print(6));    }
    
    @Test
    public void print_NumberSeven_ReturnsAsciiArtI() {
        assertEquals("__      __    _____     _____ \n\\ \\    / /   |_   _|   |_   _|\n \\ \\  / /      | |       | |  \n  \\ \\/ /       | |       | |  \n   \\  /       _| |_     _| |_ \n    \\/       |_____|   |_____|", RomanPrinter.print(7));
    }

    @Test
    public void print_NumberEight_ReturnsAsciiArtI() {
        assertEquals("__      __    _____     _____     _____ \n\\ \\    / /   |_   _|   |_   _|   |_   _|\n \\ \\  / /      | |       | |       | |  \n  \\ \\/ /       | |       | |       | |  \n   \\  /       _| |_     _| |_     _| |_ \n    \\/       |_____|   |_____|   |_____|", RomanPrinter.print(8));
    }

    @Test
    public void print_NumberNine_ReturnsAsciiArtI() {
        assertEquals(" _____     __  __ \n|_   _|    \\ \\/ / \n  | |       \\  /  \n  | |       /  \\  \n _| |_     / /\\ \\ \n|_____|   /_/  \\_\\", RomanPrinter.print(9));
    }

    @Test
    public void print_NumberTen_ReturnsAsciiArtI() {
        assertEquals(" __  __ \n \\ \\/ / \n  \\  /  \n  /  \\  \n / /\\ \\ \n/_/  \\_\\", RomanPrinter.print(10));
    }
}
