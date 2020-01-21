package ch03a;

public class Rzutowanie {
    public static void main(String[] args) {
        double x = 9.997;
        int i = (int) x;
        int nx = (int) Math.round(x);
        System.out.println(i);
        System.out.println(nx);

        int t = 300;
        byte b = (byte) t;
        System.out.println(b); //4


    }
}
