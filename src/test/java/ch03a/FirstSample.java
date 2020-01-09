package ch03a;

import static java.lang.Math.*;

public class FirstSample {
    enum Rozmiar {MAŁY, ŚREDNI, DUŻY, EKSTRA_DUŻY}

    public static void main(String[] args) {
        System.out.println("Nie powiemy, \"Witaj. Swiecie\"");
        System.out.println(2.0 - 1.1);
        //System.out.println(2/0);
        System.out.println(3.1 / 0);
//      System.out.println(0/0);
//        int nr = 97;
//        for (char i = 97; i < 2328; i++) {
//            System.out.print("|"+nr+" "+i+"\t|");
//            nr++;
//            if(nr%9==0) System.out.println();
//        }
//        char c = 2210;
//        System.out.println(c);
//        for(;c<5000;c++) {
//            int i = (int) (Math.random() * 100);
//            System.out.print(i);
//            if(c%30==0) System.out.println();

        double y = Math.pow(2,32);
        y  = E;
        System.out.println(y);
        System.out.println(PI);
        //zaokraglanie
        double x = 9.8977;
        System.out.println(x);
        System.out.println((int)x);
        System.out.println((int)Math.round(x));

        Rozmiar s = Rozmiar.ŚREDNI;
        System.out.println(s);
        System.out.println(Rozmiar.EKSTRA_DUŻY);

        String greeting = "SiemaLudziska";
        String subs = greeting.substring(5);
        System.out.println(subs);

    }
}
