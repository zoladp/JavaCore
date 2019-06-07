package ch03;

import java.util.Scanner;

public class LotteryOds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ile liczb ma byc wylosowanych?: ");
        int k = in.nextInt();

        System.out.println("Jaka jest gorna granica przedzialu losowanych liczb?: ");
        int n = in.nextInt();

         /*
         * Obliczanie wspolczynnika dwumianowego n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*4...*k)
         */

        int lotteryOds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOds = (lotteryOds * (n + 1 - i)) / i;
        }
        System.out.printf("Twoje szanse to 1 do (%,d). Powodzenia!", lotteryOds);
    }
}
