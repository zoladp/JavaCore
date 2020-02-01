package PPJ;

import java.io.Console;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class PPJ00InputOutputStrings {
    public static void main(String[] args) {
        // Jakie ustawienia regionalne
        System.out.println(Locale.getDefault());

        // Formatowane wyjście (standardowe, System.out)
        String tekst = "Przyśpieszenie ziemskie";
        double g = 9.81;  // Przyśpieszenie ziemskie
        System.out.println(tekst + " g=" + g + " [m/s^2]");
        System.out.printf("%s g=%.3f %s\n", tekst, g, "[m/s^2]");
        System.out.format("%s g=%+8.2f %s\n", tekst, g, "[m/s^2]");

        System.out.printf("%3$S g=%2$.3f %1$S\n", tekst, g, "[m/s^2]");
        System.out.format("%3$s g=%2$-8.3f %1$s\n", tekst, g, "[m/s^2]");

        // Wczytywanie danych (z wejścia System.in)
        Scanner scn = new Scanner(System.in);
        String s;
        double d;
        System.out.print("\nPodaj wartość i miano: ");
        d = scn.nextDouble();  // Wczytywanie liczby zmiennopozycynej
        s = scn.next();       // Wczytywanie łańcucha znaków
        //System.out.println(d + " [" + s + "]");
        System.out.printf("%.3f %s%n", d, " [" + s + "]");

        // Konsola nie jest dostępna w IDE
        Console cons = System.console();
        System.out.println("System.console() zwraca: " + cons);
        if (cons != null) {
            cons.flush();
            String login = cons.readLine("Login: ");
            char[] passwd = cons.readPassword("Hasło: ");

            // check(passwd);         // Sprawdzenie hasła
            Arrays.fill(passwd, '*'); // Niszczenie znaków
            System.out.println(login + ": " + String.valueOf(passwd));
        }
        System.out.println("\nKoniec programu");
        scn.close();

    }
}
