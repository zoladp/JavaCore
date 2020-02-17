package ch03a;

import java.math.BigInteger;
import java.util.Scanner;

public class LotteryOddsBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ile liczb ma byc wylosowanych? ");
        int k = in.nextInt();

        System.out.print("Jaka jest górna granica przedziału losowanych licz? ");
        int n = in.nextInt();

        /*
         * Obliczanie wspolczynnika dwumianowego n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k);
         */

        BigInteger lotteryOds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            lotteryOds = lotteryOds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));

        System.out.printf("Twoje szanse na wygrana wynoszą 1 do ( %,d ). Powodzenia!",lotteryOds);
    }
}
