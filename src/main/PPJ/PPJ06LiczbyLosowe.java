package PPJ;

import java.util.Random;
import java.util.Scanner;

public class PPJ06LiczbyLosowe {
    public static void main(String[] args) {
        int n, z;         // Do pobrania od użytkownika
        int licznik = 0;  // Liczba wygenerowanych liczb
        Scanner scn = new Scanner(System.in);
        Random rnum = new Random();

        // Pętla konwersacji
        try {
            while(true ){
                System.out.print("Ile liczb generować: n = ");
                n = scn.nextInt();

                if(n <= 0) break;
                System.out.print("Jaki zakres 1..z: z = ");
                z = scn.nextInt();

                for(int i=0; i<n; ++i){
                    int r = rnum.nextInt(z) + 1;
                    ++licznik;
                    System.out.println("out " + r);  //System.out.flush(); Thread.sleep(10);
                    System.err.println("err " + r);
                    //System.err.flush(); Thread.sleep(100);
                }
            }
        }
        catch(Exception e) {
            System.err.println("Prawdopodobnie błędny znak na wejściu.");
        }
        System.out.println("Koniec programu");
        System.out.println("Wygenerowano liczb: " + licznik);

        scn.close();

    }
}
