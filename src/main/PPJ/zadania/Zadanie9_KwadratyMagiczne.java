package PPJ.zadania;

import java.util.Scanner;

public class Zadanie9_KwadratyMagiczne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Program generuje kwadrat magiczny nXn, n nieparzyste.\n");

        System.out.print("n = 2k+1: k = ");
        int k = scn.nextInt();
        if (k >= 0) {

            int n = 2 * k + 1;
            int[][] KM = new int[n][n];

            generujKM(KM);
            drukJustowany(KM);
        }
        scn.close();
    }

    static void generujKM(int[][] T) { // Metoda syjamska
        int n = T.length;

        // Założenie: T wyzerowana
        int i = 0, j = n / 2, ni, nj;     // Początek w środku pierwszego wiersza
        for (int v = 1; v <= n * n; ++v) { // v: kolejne wartości elementów
            T[i][j] = v;

            // Jeżli ostatnia wartość, nie wyznaczaj nowej pozycji
            if (v == n * n) break;

            // Potencjalnie nowe indeksy wg ruchu "w górę i w prawo /"
            // Tablica jest "zwinięta" w torus
            ni = (i - 1 < 0) ? n - 1 : i - 1;
            nj = (j + 1 == n) ? 0 : j + 1;
            if (T[ni][nj] > 0) // następna pozycja zajęta --> szukaj poniżej w kolumnie
                while (T[i][j] > 0) i = (i + 1) % n;
            else {
                i = ni;
                j = nj;
            }
        }
    }

    // Wydruk tablicy prostokątnej z wyrównaniem prawostronnym kolumn
    static void drukJustowany(int[][] T) {
        int m = T.length;       // Liczba wierszy
        int n = T[0].length;    // Liczba kolumn

        int[] sk = new int[n];  // Szerokości kolumn
        for (int j = 0; j < n; ++j) {
            sk[j] = 0;
            for (int i = 0; i < m; ++i)
                sk[j] = Math.max(sk[j], ("" + T[i][j]).length());
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j)
                System.out.printf("%" + sk[j] + "d ", T[i][j]);
            System.out.println();
        }
    }
}
