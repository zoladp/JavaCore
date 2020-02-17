package ch03a.arraysExcercise;

public class AverageValueOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {10,11,45,12,5,6,7,8,10,2};
        //calculate average value of array elements
        int sum =0;
        for (int ar: arr)
            sum = sum+ar;
        double avg = sum/arr.length;
        System.out.println("Suma wszystkich elementow: "+sum);
        System.out.println("Srednia wszystkich elementow: "+avg);
    }
}
