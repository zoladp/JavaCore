package ch03;

import static  java.lang.Math.*;

public class FunkcjeStaleMatematyczne {
    public static void main(String[] args) {
        double x = 312000;
        double y = Math.sqrt(x);
        short z = (byte) round(y); //metoda round zwraca wartosc typu long
        long dp = (long) Math.pow(z,6);
        long l = Long.MAX_VALUE;
        System.out.println(y);
        System.out.println("Round: "+z);
        System.out.println("Pow: "+dp);
        System.out.println("Liczba PI: "+PI); //nie ma przedrostka Math. poniewaz jest import statyczny
        System.out.println("Liczba PI(round): "+Math.round(PI)); //nie ma przedrostka Math. poniewaz jest import statyczny
        System.out.println("Liczba Eulera: "+Math.E);
        System.out.println("Liczba Eulera(round): "+Math.round(Math.E));
        System.out.println("Long max value: "+l);
        System.out.println("Long sinus value: "+Math.sin(l));

        //konwersja wartosci logicznej na wartosc liczbowa
        boolean b = false;
//        int wynik = b ? 1 : 0;
        int wynik = (PI>E) ? 1 : 0;
        System.out.println(wynik);

        for (int i = -128; i < 300; i++) {
            byte bt = (byte)i;
            String wyn = i==bt?"rowne":"nierowne";
            System.out.print(i+"\t\trzut byte: "+bt+"\t\twynik: "+wyn+"\t|\t");
            if(i%2==0) System.out.println();
        }


    }
}
