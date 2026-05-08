////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
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
    @Test
    public void print_NumberSixty_ReturnsAsciiArtI() {
        assertEquals(" _          __  __ \n| |         \\ \\/ / \n| |          \\  /  \n| |          /  \\  \n| |____     / /\\ \\ \n|______|   /_/  \\_\\", RomanPrinter.print(60));
    }

    @Test
    public void print_NumberSeventy_ReturnsAsciiArtI() {
        assertEquals(" _          __  __     __  __ \n| |         \\ \\/ /     \\ \\/ / \n| |          \\  /       \\  /  \n| |          /  \\       /  \\  \n| |____     / /\\ \\     / /\\ \\ \n|______|   /_/  \\_\\   /_/  \\_\\", RomanPrinter.print(70));
    }

    @Test
    public void print_NumberEighty_ReturnsAsciiArtI() {
        assertEquals(" _          __  __     __  __     __  __ \n| |         \\ \\/ /     \\ \\/ /     \\ \\/ / \n| |          \\  /       \\  /       \\  /  \n| |          /  \\       /  \\       /  \\  \n| |____     / /\\ \\     / /\\ \\     / /\\ \\ \n|______|   /_/  \\_\\   /_/  \\_\\   /_/  \\_\\", RomanPrinter.print(80));
    }

    @Test
    public void print_NumberNinety_ReturnsAsciiArtI() {
        assertEquals(" __  __      _____ \n \\ \\/ /     / ____|\n  \\  /     | |     \n  /  \\     | |     \n / /\\ \\    | |____ \n/_/  \\_\\    \\_____|", RomanPrinter.print(90));
    }

    @Test
    public void print_NumberOneHundred_ReturnsAsciiArtI() {
        assertEquals("  _____ \n / ____|\n| |     \n| |     \n| |____ \n \\_____|", RomanPrinter.print(100));
    }

    @Test
    public void print_NumberTwoHundred_ReturnsAsciiArtI() {
        assertEquals("  _____      _____ \n / ____|    / ____|\n| |        | |     \n| |        | |     \n| |____    | |____ \n \\_____|    \\_____|", RomanPrinter.print(200));
    }

    @Test
    public void print_NumberThreeHundred_ReturnsAsciiArtI() {
        assertEquals("  _____      _____      _____ \n / ____|    / ____|    / ____|\n| |        | |        | |     \n| |        | |        | |     \n| |____    | |____    | |____ \n \\_____|    \\_____|    \\_____|", RomanPrinter.print(300));
    }
    
    @Test
    public void print_NumberFourHundred_ReturnsAsciiArtI() {
        assertEquals("  _____     _____  \n / ____|   |  __ \\ \n| |        | |  | |\n| |        | |  | |\n| |____    | |__| |\n \\_____|   |_____/ ", RomanPrinter.print(400));
    }
    
    @Test
    public void print_NumberFiveHundred_ReturnsAsciiArtI() {
        assertEquals(" _____  \n|  __ \\ \n| |  | |\n| |  | |\n| |__| |\n|_____/ ", RomanPrinter.print(500));
    } 

    @Test
    public void print_NumberSixHundred_ReturnsAsciiArtI() {
        assertEquals(" _____       _____ \n|  __ \\     / ____|\n| |  | |   | |     \n| |  | |   | |     \n| |__| |   | |____ \n|_____/     \\_____|", RomanPrinter.print(600));
    } 

    @Test
    public void print_NumberSevenHundred_ReturnsAsciiArtI() {
        assertEquals(" _____       _____      _____ \n|  __ \\     / ____|    / ____|\n| |  | |   | |        | |     \n| |  | |   | |        | |     \n| |__| |   | |____    | |____ \n|_____/     \\_____|    \\_____|", RomanPrinter.print(700));
    } 

    @Test
    public void print_NumberEightHundred_ReturnsAsciiArtI() {
        assertEquals(" _____       _____      _____      _____ \n|  __ \\     / ____|    / ____|    / ____|\n| |  | |   | |        | |        | |     \n| |  | |   | |        | |        | |     \n| |__| |   | |____    | |____    | |____ \n|_____/     \\_____|    \\_____|    \\_____|", RomanPrinter.print(800));
    } 

    @Test
    public void print_NumberNineHundred_ReturnsAsciiArtI() {
        assertEquals("  _____     __  __ \n / ____|   |  \\/  |\n| |        | \\  / |\n| |        | |\\/| |\n| |____    | |  | |\n \\_____|   |_|  |_|", RomanPrinter.print(900));
    } 

    @Test
    public void print_NumberThousand_ReturnsAsciiArtI() {
        assertEquals(" __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|", RomanPrinter.print(1000));
    } 
}
