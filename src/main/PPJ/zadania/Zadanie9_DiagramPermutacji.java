package PPJ.zadania;

 /* Prezentacja pseudograficzna diagramów permutacji
  ==========
  A.Pająk, 2016

  Wykorzystywane są znaki "box-drawing":

  ─ │ ┌ ┐ └ ┘ ├ ┤ ┬ ┴ ┼

  pozwalające prezentować raster linii z naniesioną permutacją.
  Np. dla permutacji [5 2 4 1 3] generowany jest diagram wg kolumn:

5 O──┬──┬──┬──┐1
  │  │  │  │  │2
4 ├──┼──O──┼──┤3
  │  │  │  │  │4
3 ├──┼──┼──┼──O5
  │  │  │  │  │6
2 ├──O──┼──┼──┤7
  │  │  │  │  │8
1 └──┴──┴──O──┘9
  1  2  3  4  5

Permutacja jest generowana albo podawana przez użytkownika.
Generyczny raster dla n=5 (zaznaczono pozycje w poziomie i pionie):

 1234567890123
5 ┌──┬──┬──┬──┐1
  │  │  │  │  │2
4 ├──┼──┼──┼──┤3
  │  │  │  │  │4
3 ├──┼──┼──┼──┤5
  │  │  │  │  │6
2 ├──┼──┼──┼──┤7
  │  │  │  │  │8
1 └──┴──┴──┴──┘9
  1  2  3  4  5

*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie9_DiagramPermutacji {
    static final int MAX = 20;  // Maks. rozmiar permutacji

    //Diagram Permutacji znakowo w tablicy statycznej
    static char[][] DP = new char[2 * MAX][3 * MAX]; // ---  kolumna: 3 znaki
    // ---  wiersz:  2 linie

    /* Pokaż diagram permutacji wg tablicy P[n].
      Jeżeli P = [5 2 4 1 3] to pokazany zostanie diagram:

    5 O──┬──┬──┬──┐
      │  │  │  │  │
    4 ├──┼──O──┼──┤
      │  │  │  │  │
    3 ├──┼──┼──┼──O
      │  │  │  │  │
    2 ├──O──┼──┼──┤
      │  │  │  │  │
    1 └──┴──┴──O──┘
      1  2  3  4  5

    */
    static void diagramPermutacji(int[] P) {
        int n = P.length;

        // Wypełnij tablicę DP rastrem n x n linii
        // Wiersz górny (numer n w prezentacji)
        // ┌──┬──┬──┬──┐

        DP[0][0] = '┌';
        DP[0][1] = DP[0][2] = '─';
        for (int j = 1; j < n - 1; ++j) {
            DP[0][3 * j] = '┬';
            DP[0][3 * j + 1] = DP[0][3 * j + 2] = '─';
        }
        DP[0][3 * n - 3] = '┐';

        // Wiersze wewnętrzne
        // │  │  │  │  │
        // ├──┼──┼──┼──┤
        for (int i = 0; i < n - 2; ++i) {
            // │  │  │  │  │
            for (int j = 0; j < n - 1; ++j) {
                DP[2 * i + 1][3 * j] = '│';
                DP[2 * i + 1][3 * j + 1] = DP[2 * i + 1][3 * j + 2] = ' ';
            }
            DP[2 * i + 1][3 * n - 3] = '│';

            // ├──┼──┼──┼──┤
            DP[2 * i + 2][0] = '├';
            DP[2 * i + 2][1] = DP[2 * i + 2][2] = '─';
            for (int j = 1; j < n - 1; ++j) {
                DP[2 * i + 2][3 * j] = '┼';
                DP[2 * i + 2][3 * j + 1] = DP[2 * i + 2][3 * j + 2] = '─';
            }
            DP[2 * i + 2][3 * n - 3] = '┤';
        }

        // Wiersz ostatni (numer 1 w prezentacji)
        // │  │  │  │  │
        // └──┴──┴──┴──┘
        for (int j = 0; j < n; ++j) {
            DP[2 * n - 3][3 * j] = '│';
            DP[2 * n - 3][3 * j + 1] = DP[2 * n - 3][3 * j + 2] = ' ';
        }
        DP[2 * n - 3][3 * n - 3] = '│';

        DP[2 * n - 2][0] = '└';
        DP[2 * n - 2][1] = DP[2 * n - 2][2] = '─';
        for (int j = 1; j < n - 1; ++j) {
            DP[2 * n - 2][3 * j] = '┴';
            DP[2 * n - 2][3 * j + 1] = DP[2 * n - 2][3 * j + 2] = '─';
        }
        DP[2 * n - 2][3 * n - 3] = '┘';

        // Rozmieść permutację: P[i] oznacza pozycję w kolumnie i-tej
        for (int i = 0; i < n; ++i)
            DP[2 * (n - P[i])][3 * i] = 'O';

        // Pokaż tablicę DP
        for (int i = 0; i < 2 * n - 1; ++i) {
            if ((i & 1) == 0)
                System.out.printf("%3d ", n - i / 2);
            else
                System.out.printf("    ");
            for (int j = 0; j < 3 * n - 2; ++j)
                System.out.printf("%c", DP[i][j]);
            System.out.println();
        }

        // Pozycje kolumn
        System.out.printf("  ");
        for (int j = 1; j <= n; ++j)
            System.out.printf("%3d", j);
        System.out.println();
    }

    // -----
    static void pokaz(int[] tab) {
        System.out.print(tab.length + ": ");
        System.out.println(Arrays.toString(tab));
    }

    // -----
    public static void main(String[] args) {
        int n;  // Aktualny rozmiar permutacji
        int m;  // Tyle permutacji do wygenerowania
        int[] P;  // Permutacja

        try (Scanner scn = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nRozmiar permutacji (2.." + MAX + "): n = ");
                n = scn.nextInt();
                if (n <= 1 || n > MAX) break;
                P = new int[n];

                System.out.print("Liczba permutacji: m = ");
                m = scn.nextInt();
                ;
                if (m <= 0) break;
                System.out.println("Permutacja startowa (1..n)");
                for (int i = 0; i < n; ++i) P[i] = scn.nextInt();

                for (int i = 0; i < m; ++i) {
                    System.out.println();
                    pokaz(P);
                    System.out.println();
                    diagramPermutacji(P);
                    tasuj(P);
                }
            }
        }
        System.out.println("\nKoniec programu");
    }

    // -----
    static void tasuj(int[] P) {
        int index, tmp, n = P.length;
        Random rg = new Random();
        for (int i = n - 1; i > 0; i--) {
            index = rg.nextInt(i + 1);
            tmp = P[index];
            P[index] = P[i];
            P[i] = tmp;
        }
    }
}
