package com.newthinktank;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<String>(20);
        aL1.add("Sue");
        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        aL2.add(88);
        aL2.add(99);
        aL2.set(5,77);
        for (Integer x: aL2) System.out.println(x);

        long dlugi = 9_223_000_000_000_000_000L;
        int podwojny = -2_147_000_000;

        float pprec = 9.99999999f;
        double pdwprec = 1.7900000000000000000000000000000000000;


        int pio = 0xCAFE;
        System.out.println("hex "+pio);
        System.out.println(dlugi);
        System.out.println(podwojny);
        System.out.println("double"+pdwprec);

        System.out.println(Double.isNaN(pdwprec));
        System.out.println(2.0 - 1.1);
        System.out.println(1./1000);

        BigDecimal bd = new BigDecimal(pdwprec);
        System.out.println(bd);
    }


    public void pliki() {
        File file = new File("src/mojplik.txt");

    }

}
