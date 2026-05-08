// Java program to print Happy Holi
import java.io.*;

class HappyHoli {
    public static void main (String[] args) {
        // You can change this character to any color symbol
        char ch = '*'; 

        // Row 1: H
        for (int i = 1; i <= 34; i++) {
            if (i == 4 || i == 7 || i == 10 || i == 11 || i == 14 || i == 15 || i == 16 || i == 17 || i == 19 || i == 20 || i == 21 || i == 22 || i == 24 || i == 27)
                System.out.print(ch);
            else
                System.out.print(" ");
        }
        System.out.println();

        // Row 2: A
        for (int i = 1; i <= 34; i++) {
            if (i == 4 || i == 7 || i == 9 || i == 12 || i == 14 || i == 17 || i == 19 || i == 22 || i == 24 || i == 27)
                System.out.print(ch);
            else
                System.out.print(" ");
        }
        System.out.println();

        // Row 3: P
        for (int i = 1; i <= 34; i++) {
            if (i == 4 || i == 5 || i == 6 || i == 7 || i == 9 || i == 10 || i == 11 || i == 12 || i == 14 || i == 15 || i == 16 || i == 17 || i == 19 || i == 20 || i == 21 || i == 22 || i == 25 || i == 26)
                System.out.print(ch);
            else
                System.out.print(" ");
        }
        System.out.println();

        // Row 4: P
        for (int i = 1; i <= 34; i++) {
            if (i == 4 || i == 7 || i == 9 || i == 12 || i == 14 || i == 19 || i == 25 || i == 26)
                System.out.print(ch);
            else
                System.out.print(" ");
        }
        System.out.println();
        
        // Add more rows for "Holi" using similar logic...
        System.out.println("   " + ch + "   " + ch + "   " + ch + "  " + ch + ch + ch + "  " + ch + "      " + ch + "  " + ch + ch + ch);
        System.out.println("   " + ch + "   " + ch + "   " + ch + "  " + ch + "   " + ch + "  " + ch + "      " + ch + "  " + ch + "   " + ch);
        System.out.println("   " + ch + "   " + ch + "   " + ch + "  " + ch + "   " + ch + "  " + ch + "      " + ch + "  " + ch + "   " + ch);
        System.out.println("   " + ch + ch + ch + "   " + ch + "  " + ch + ch + ch + "  " + ch + ch + ch + "  " + ch + "  " + ch + ch + ch);
    }
}

