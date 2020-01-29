package ch03a;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawingSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ile liczb musisz wylosowac? ");
        int k = in.nextInt();
        System.out.print("Jaka jest największa liczba? ");
        int n = in.nextInt();

        //Zapelnienie tablicy liczbami 1,2,3 ... n
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        //Losowanie k liczb i zapisanie ich w drugiej tablicy
        int[] result = new int[k];
        for(int i = 0; i<result.length; i++) {
            //Losowanie indeksu z zakresu od 0 do n-1
            int r = (int) (Math.random()*n);

            //Pobranie elementu z losowej lokalizacji
            result[i] =  numbers[r];

            //Przeniesienie ostatniego elementu do losowej lokalizacji
            numbers[r] = numbers[n-1];
            n--;
        }
        //Wydruk zapisanej tablicy
//        int[] result = new int[k];
//        for(int i = 0; i < result.length; i++)
//        {
//            int r = (int) (Math.random()*n);
//            result[i] = numbers[r];
//            numbers[r] = numbers[n -1];
//        }

        Arrays.sort(result);
        System.out.println("Postaw na nastepujace liczby dzieki nim zdobedziesz bogactwo!");
        for (int r : result) System.out.println(r);
    }
}
