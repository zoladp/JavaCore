package ch04;

public class Testowy {
    static float f = 2f;
    static float d = 1.1f;
    static double d1 = 2;
    static double d2 = 1.1;

    public static void main(String[] args) {
        System.out.println(f-d);
        System.out.println((double) f- d);
        System.out.println((double) f- (double) d);
        System.out.println(d1-d2);
    }
}
