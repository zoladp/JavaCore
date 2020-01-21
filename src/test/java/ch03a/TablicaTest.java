package ch03a;

import java.util.Arrays;
import java.util.Random;

public class TablicaTest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a;
        a = new int[100];
        int[] b = new int[22];

        int wielkTab = 100;
        String[] st = new String[wielkTab];

        int[] t = new int[100];
        for (int i =0; i<100;i++) t[i] = random.nextInt()+1;

        int licznik = 0;
        for (int x : t) {
            String msg = String.format(" %1$,d \t, %1$x \t, %1$o |\n",x);
            System.out.printf(msg);
            st[licznik] = msg;
            licznik++;
        }
        System.out.println("\n##element "+st[11]);

        //kolejny sposob wyswietlania tablicy
        System.out.println(Arrays.toString(t));

    }
}
