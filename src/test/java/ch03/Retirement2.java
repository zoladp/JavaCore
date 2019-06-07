package ch03;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ile pieniedzy rocznie bedziesz wplacac?: ");
        double payment = in.nextDouble();

        System.out.println("Stopa oprocentowania w %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            //drukowanie aktualnego stanu konta
            System.out.printf("Po uplywie %d lat stan twojego konta wyniesie %,.2f%n",year,balance);
            System.out.println("Chcesz przejsc na emeryture? (T/N): ");
            input = in.next();
        } while (input.equalsIgnoreCase("N"));
    }
}
