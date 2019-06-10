package ch03;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ile liczb musisz wylosować? ");
        int k = in.nextInt();

        System.out.println("Jaka jest najwieksza liczba? ");
        int n = in.nextInt();

        //1.Zapelnienie tablicy liczbami
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        //2.Losowanie k liczb i zapisanie ich w drugiej tablicy
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //losowanie indeksu z zakresu od 0 do n-1
            int r = (int) (Math.random() * n);
            //pobranie elementu z losowej lokalizacji
            result[i] = numbers[r];
            //przeniesienie ostatniego elementu do losowej lokalizacji
            numbers[r] = numbers[n-1];
            n--;
        }
        //wydruk zapisanej tablicy
        Arrays.sort(result);
        System.out.println("Postaw na następujące liczby. Dzięki nim zdobędziesz bogactwo!");
        for (int r : result) System.out.println(r);
    }
}
