package ch03a;

import java.util.Arrays;

public class InicjowanieTworzenieTablicAnonimowych {
    public static void main(String[] args) {
        int[] smallPrimes = {2,3,5,7,11,13};
//        new int[] {17,19,23,}
        smallPrimes = new int[] {17,19,23,29,31,37};
        int[] anonymous = {17,19,23,31,37};
        smallPrimes = anonymous;

        int[] copiedArray = Arrays.copyOf(smallPrimes,smallPrimes.length);
        System.out.println("skopiowana "+Arrays.toString(copiedArray));



    }
}
