package ch03a;

public class PetelkaFor {
    public static void main(String[] args) {
        int licz=1;
        for (double i =0.01;i<=1.0031; i+=0.00331) {
            System.out.println(licz + ".licznik " + i);
            licz++;
        }
    }
}
