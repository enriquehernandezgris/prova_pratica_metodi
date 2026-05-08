////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

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

    // Tests
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

    @Test
    public void print_NumberFifteen_ReturnsAsciiArtI() {
        assertEquals(" __  __    __      __\n \\ \\/ /    \\ \\    / /\n  \\  /      \\ \\  / / \n  /  \\       \\ \\/ /  \n / /\\ \\       \\  /   \n/_/  \\_\\       \\/    ", RomanPrinter.print(15));
    }

    @Test
    public void print_NumberNineteen_ReturnsAsciiArtI() {
        assertEquals(" __  __     _____     __  __ \n \\ \\/ /    |_   _|    \\ \\/ / \n  \\  /       | |       \\  /  \n  /  \\       | |       /  \\  \n / /\\ \\     _| |_     / /\\ \\ \n/_/  \\_\\   |_____|   /_/  \\_\\", RomanPrinter.print(19));
    }

    @Test
    public void print_NumberTwenty_ReturnsAsciiArtI() {
        assertEquals(" __  __     __  __ \n \\ \\/ /     \\ \\/ / \n  \\  /       \\  /  \n  /  \\       /  \\  \n / /\\ \\     / /\\ \\ \n/_/  \\_\\   /_/  \\_\\", RomanPrinter.print(20));
    }

    @Test
    public void print_NumberThirty_ReturnsAsciiArtI() {
        assertEquals(" __  __     __  __     __  __ \n \\ \\/ /     \\ \\/ /     \\ \\/ / \n  \\  /       \\  /       \\  /  \n  /  \\       /  \\       /  \\  \n / /\\ \\     / /\\ \\     / /\\ \\ \n/_/  \\_\\   /_/  \\_\\   /_/  \\_\\", RomanPrinter.print(30));
    }

    @Test
    public void print_NumberForty_ReturnsAsciiArtI() {
        assertEquals(" __  __     _      \n \\ \\/ /    | |     \n  \\  /     | |     \n  /  \\     | |     \n / /\\ \\    | |____ \n/_/  \\_\\   |______|", RomanPrinter.print(40));
    }

    @Test
    public void print_NumberFifty_ReturnsAsciiArtI() {
        assertEquals(" _      \n| |     \n| |     \n| |     \n| |____ \n|______|", RomanPrinter.print(50));
    }
}
