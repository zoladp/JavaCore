package ch03a.arraysExcercise;

import java.util.Arrays;

public class Exc1SortArrays {
    public static void main(String[] args) {
        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        System.out.println("Original numeric array: "+ Arrays.toString(myArray1));
        Arrays.sort(myArray1);
        System.out.println("Sorted numeric array: "+Arrays.toString(myArray1));
        int sum = 0;
        for(int i = 0; i < myArray1.length; i++) {
            sum += myArray1[i];
        }
        System.out.println("Suma elementow numeric array: "+sum);


        String[] myArray2 = {
                "Java", "Python",
                "PHP", "C#",
                "C programming", "C++"
        };

        System.out.println("Original string array: "+Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("Sorted string array: "+Arrays.toString(myArray2));
    }
}
