package ch03;

import java.util.Date;
import java.util.Locale;

public class FormatDanychWy {
    public static void main(String[] args) {
        double x = 10000.0 / 3;
        int c = 5660;
        String name = "Piotr";
        byte age = 41;
        System.out.println(x);
        System.out.printf("%8.2f",x); //3333,33
        System.out.println();
        System.out.printf("%,.2f",x); // 3 333,33
        System.out.println();
        System.out.printf("%,(.2f",-7648d); //(7 648,00)
        System.out.println();
        System.out.printf("%3d",c);

        //tworzenie sformatowanego lancucha
        String message = String.format("\nWitaj, %s. W przyszłym roku będziesz mieć lat %d",name,age);
        //System.out.println(String.format("\nWiitaj, %s. W przyszłym roku będziesz mieć lat %d",name,age));
        System.out.println(message);

        //formatowanie daty i godziny
        System.out.printf("%tc", new Date()); //Cz cze 06 13:26:48 CEST 2019
        System.out.println("");
        System.out.printf(Locale.ITALIAN,"%tc", new Date());

    }
}
