package PPJ;

import java.util.Scanner;

public class PPJ03PodstawyZapisuLiczb {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            long n; // n - liczba do prezentacji rozwinięć
            int p; // Podstawa zapisu { 2 .. 36 }

            System.out.println("Liczba dziesiętna n w zapisie przy podstawie p.");
            System.out.println("Podstawa p ze zbioru {2..36}; liczba n = 0 kończy program.\n");

            while (true) { // Konwersacja

                System.out.print("n = ");
                if (scn.hasNextLong())
                    n = scn.nextLong();
                else {
                    System.out.println("Błędne dane wejściowe");
                    break;
                }

                if (n <= 0) break;

                System.out.print("p = ");
                p = scn.nextInt();
                if (p < 2 || p > 36) break;

                System.out.println("n = " + Long.toString(n, p));
            }
            System.out.print("Koniec programu");
        }
    }
}
