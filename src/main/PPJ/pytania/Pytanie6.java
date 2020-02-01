package PPJ.pytania;

import java.util.Scanner;

public class Pytanie6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            System.out.println("Nazwisko: ");
            String name = scn.next();
            if (name.equalsIgnoreCase("x")) break;
            System.out.println(name.toUpperCase());
            for (int i = name.length() - 1; i >= 0; --i)
                System.out.print(name.toUpperCase().charAt(i));
            System.out.println();
        }
    }
}
