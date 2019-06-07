package ch03;

import java.util.Scanner;

public class WyborWielokrSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Wybierz opcje (1,2,3,4)");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Wybrano opcje 1.");
                    break;
                case 2:
                    System.out.println("Wybrano opcje 2.");
                    break;
                case 3:
                    System.out.println("Wybrano opcje 3.");
                    break;
                case 4:
                    System.out.println("Wybrano opcje 4.");
                    break;
                default:
                    System.out.println("Nie poprawna opcja.");
            }
        }
        while (choice <= 4 && choice > 0);
    }
}
