package ch03;

import java.util.Scanner;

public class WejscieWyjscie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Jak sie nazywasz? ");
        String name = in.nextLine();
        System.out.println("Ile masz lat? ");
        int wiek = in.nextInt();

        System.out.println("Witaj użytkowniku "+name+". W przyszlym roku bedziesz mial "+(++wiek)+" lat");
    }
}
