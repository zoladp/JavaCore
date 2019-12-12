package com.newthinktank;

import java.io.File;
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



    }

    public void pliki() {
        File file = new File("src/mojplik.txt");

    }

}
