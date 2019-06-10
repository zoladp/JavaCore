package ch03;

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        int[] b = new int[20];
        for (int i = 1; i < b.length; i++) {
            b[i]=(i*i)+i+3;
            System.out.println(b[i]);
        }
        System.out.println("dlugosc tablicy: "+b.length);

        int[] x;
        int y[]; //zmienna tablicowa mozna zdefiniowac na dwa sposoby

        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (String n : names) {
            System.out.print(" -> "+n+"\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(b));

        //Inicjowanie tablic
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};

        //Tablica anonimowa
        smallPrimes = new int[] {17, 19, 31, 23, 37};
        int[] anonymous = {17,19,23,29,31,37};
        smallPrimes = anonymous;

        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 99;
        System.out.println("Po zmianie w luckyNumbers");
        System.out.println(smallPrimes[5]);

        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, 2*luckyNumbers.length);
        System.out.println(Arrays.toString(copiedLuckyNumbers));

    }
}
