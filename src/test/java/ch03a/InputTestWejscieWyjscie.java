package ch03a;

import java.util.Date;
import java.util.Scanner;

public class InputTestWejscieWyjscie {
    public static void main(String[] args) {
//        System.out.printf("%tY", new Date());
        Scanner in = new Scanner(System.in);
        System.out.print("Jak się nazywasz? ");
        String name = in.nextLine();
        System.out.print("Ile masz lat: ");
        int age = in.nextInt(); age++;
        String wiek = " lat";
        wiek = (age%10==0) && age<2 ?" rok":wiek+"a";
        System.out.println("Witaj użytkowniku "+name+". W przyszlym roku bedziesz miec "+age+wiek);
    }
}
