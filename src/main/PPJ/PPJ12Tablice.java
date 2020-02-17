package PPJ;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PPJ12Tablice {
    public static void main(String[] args) {
        int[] a; //deklaracja tablicy
        int b = 0;
        int c = 0;
        a = new int[100]; //inicjacja stu elemtow tablicy
        for (int i = 1; i < a.length; i++) {
            a[i] = (i * i + 5) / i;
            //b = a[i]+a[i-1];
            //c = b+b+a[i];
            System.out.println(a[i]);
        }
    }

    public static class ZZ_MaksymalneTrapezy {
        public static void main(String[] args) {
            Random rgen = new Random();
            Scanner scn = new Scanner(System.in);

            // Prezentacja programu
            System.out.print("Problem 0: Maksymalny trapez w zbiorze punkt?w\n\n");
            System.out.print("Punkty z pierwszej ?wiartki: (x, y) = (i, Y[i]) \n");
            System.out.print("Tablica Y zadawana przez u?ytkownika albo generowana.\n\n");

            while (true) { // Kolejna instancja problemu
                int n, zakres, A;
                String s;

                System.out.print("Ile punkt?w: n = ");
                n = scn.nextInt();
                if (n <= 1) {  // Nie ma nic do roboty
                    System.out.print("\nKONIEC PROGRAMU");
                    scn.close();
                    return;
                }

                int[] Y = new int[n];

                System.out.print("Generowanie losowe? (t/n) ");
                s = scn.next();
                //System.out.println("*** pobrano: " + s);
                if (s.equals("t")) {
                    System.out.print("Zakres losowania [0..z]: z = ");
                    zakres = scn.nextInt();

                    for (int i = 0; i < n; ++i)
                        Y[i] = rgen.nextInt(zakres);
                } else {
                    System.out.print("Wprowadzanie " + n + " liczb nieujemnych\n");
                    for (int i = 0; i < n; ++i)
                        Y[i] = scn.nextInt();
                }

                if (s.equals("t")) show(Y); // Poka? wygenerowane dane

                ArrayList<int[]> R = new ArrayList<int[]>();

                A = MaxTrapez_naiwnie(Y, R);  // A: maks. pole trapezu
                System.out.println("Maksymalne podwojone pole trapezu: A = " + A);
                for (int i = 0; i < (int) R.size(); ++i)
                    System.out.println("   p=" + R.get(i)[0] + " q=" + R.get(i)[1]);

                System.out.println();

                show_spec(Y, R.get(0)[0], R.get(0)[1]);
            }
        }

        static int max_element(int[] T) {
            int maxel = T[0];
            for (int i = 1; i < T.length; ++i)
                maxel = maxel > T[i] ? maxel : T[i];
            return maxel;
        }

        //Wydruk wektora (20 liczb w wierszu)
        static void show(int[] Y) {
            int n = Y.length;

            for (int i = 0; i < n; ++i) {
                System.out.print(Y[i] + " ");
                if ((i + 1) % 20 == 0) System.out.println();
            }
            if (n % 20 != 0) System.out.println();
        }

        //Pokaz pseudograficzny punkt?w i trapezu
        static void show_spec(int[] Y, int p, int q) {
            final int MAX = 40;
            int n = Y.length;

            // Ograniczenie rozmiaru instancji
            if (n > MAX) {
                System.out.println("Prezentacja pseudograficzna tylko dla n<=" + MAX);
                return;
            }

            int max_Y = max_element(Y); // Znajd? maksimum w Y

            for (int y = max_Y; y >= 0; --y) {
                System.out.print(y % 10 + ": ");  // wsp?rz?dna y modulo 10
                for (int x = 0; x < n; ++x) {     // generuj wiersz y
                    if (Y[x] == y) System.out.print("o ");
                    else if ((x == p || x == q) && Y[x] > y) System.out.print("| ");
                    else System.out.print(". ");
                }
                System.out.println();
            }

            // Poka? o? OX
            System.out.print("   ");
            for (int x = 0; x < n; ++x) System.out.print(x % 10 + " ");
            System.out.print("\n\n");
        }

        //Wersja "naiwna" - sprawdza wszystkie mo?liwe pary punkt?w.
        //W R umieszcza wszystkie pary p, q wyznaczaj?ce maks.trapezy.
        static int MaxTrapez_naiwnie(int[] Y, ArrayList<int[]> R) {
            int n = Y.length;  // Liczba punkt?w
            int maxarea = -1;
            int[] para;

            for (int p = 0; p < n - 1; ++p)
                for (int q = p + 1; q < n; ++q)
                    if ((q - p) * (Y[p] + Y[q]) > maxarea) {
                        R.clear();     // Usu? dotychczas zarejestrowane rozwi?zania
                        para = new int[]{p, q};
                        R.add(para); // Rejestruj nowe, lepsze
                        maxarea = (q - p) * (Y[p] + Y[q]);
                    } else if ((q - p) * (Y[p] + Y[q]) == maxarea)
                        R.add(new int[]{p, q}); // Nast?pny trapez o tym samym polu

            return maxarea;
        }
    }
}


