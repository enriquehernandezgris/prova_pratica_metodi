////////////////////////////////////////////////////////////////////
// Enrique Hernández Gris 2169844
// Manuel Ibáñez Martínez-Lozano 2169871
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {

    private static final Map<Character, String[]> AsciiDict = new HashMap<>();

    static {
        AsciiDict.put('I', new String[]{
                " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|"
        });
        AsciiDict.put('V', new String[]{
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    "
        });
        AsciiDict.put('X', new String[]{
                " __  __ ",
                " \\ \\/ / ",
                "  \\  /  ",
                "  /  \\  ",
                " / /\\ \\ ",
                "/_/  \\_\\"
        });
        AsciiDict.put('L', new String[]{
                " _      ",
                "| |     ",
                "| |     ",
                "| |     ",
                "| |____ ",
                "|______|"
        });
        AsciiDict.put('C', new String[]{
                "  _____ ",
                " / ____|",
                "| |     ",
                "| |     ",
                "| |____ ",
                " \\_____|"
        });
        AsciiDict.put('D', new String[]{
                " _____  ",
                "|  __ \\ ",
                "| |  | |",
                "| |  | |",
                "| |__| |",
                "|_____/ "
        });
        AsciiDict.put('M', new String[]{
                " __  __ ",
                "|  \\/  |",
                "| \\  / |",
                "| |\\/| |",
                "| |  | |",
                "|_|  |_|"
        });

    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder AsciiArt = new StringBuilder();
        char[] chars = romanNumber.toCharArray();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < chars.length; j++) {
                String[] letter = AsciiDict.get(chars[j]);

                if (letter != null) {
                    AsciiArt.append(letter[i]);
                    
                    if (j < chars.length - 1) {
                        AsciiArt.append("   ");
                    }
                }
            }
            
            if (i < 5) {
                AsciiArt.append("\n");
            }
        }
        return AsciiArt.toString();
    }
    }