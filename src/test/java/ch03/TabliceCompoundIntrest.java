package ch03;

import java.util.Arrays;

public class TabliceCompoundIntrest {
    public static void main(String[] args) {
        final double STARTDATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //Ustawienia stop oprocentowania na wartosc w przedziale od 10 do 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTDATE + j) / 100.0;
        }
        double[][] balances = new double[NYEARS][NRATES];

        //Ustawienie sald poczatkowych na 10 000
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000;
        }
        System.out.println("tu--");
        System.out.println(Arrays.deepToString(balances));

        //Obliczenie odsetek dla przyszlych lat
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                //pobranie sald z minionego roku z poprzedniego wiersza
                double oldBalance = balances[i - 1][j];

                //obliczanie odsetek
                double interest = oldBalance * interestRate[j];

                //obliczanie tegorocznego salda
                balances[i][j] = oldBalance + interest;
            }
        }
        //Wydruk jednego wiersza stop oprocentowania
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }
        System.out.println();

        //Wydruk tabeli sald
        for (double[] row : balances) {
            //wydruk wiersza tabeli
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
        for (int i = 0; i < interestRate.length; i++) {
            System.out.print("----------");
        }
        System.out.println();
        for (int j = 0; j < interestRate.length; j++) {

            System.out.printf("%10.2f", balances[9][j] - balances[0][j]);
        }

    }
}

