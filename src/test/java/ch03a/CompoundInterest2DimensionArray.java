package ch03a;

public class CompoundInterest2DimensionArray {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //Ustawienie stop oproc. na wartosc w przedziale 10 - 15%.
        double[] interestRate = new double[NRATES];
        for(int j = 0; j<interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        //Ustawienie sald poczatkowych na 10'000
        for(int j = 0; j<balances[0].length;j++)
            balances[0][j] = 10000;

        //Obiczenie odsetek dla przyszlych lat
        for (int i = 1; i < balances.length; i++)
        {
            for (int j = 0; j < balances[i].length; j++)
            {
                //Pobranie sald z minionego roku z poprzedniego wiersza
                double oldBalance = balances[i-1][j];

                //Obliczenie odsetek
                double interest = oldBalance * interestRate[j];

                //Obliczanie tegorocznego salda
                balances[i][j] = oldBalance + interest;
            }
        }
        //Wydruk jednego wiersza stop oprocentowania
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%",100*interestRate[j]);

        System.out.println();

        //Wydruk tabeli sald.
        for (double[] row : balances)
        {
            //Wydruk wiersza tabeli
            for (double b : row)
                System.out.printf("%10.2f",b);

            System.out.println();
        }
    }
}
