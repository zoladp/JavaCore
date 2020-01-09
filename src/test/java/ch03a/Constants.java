package ch03a;

public class Constants {
    static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Rozmiar papieru w centymetrach: "
        + paperWidth * CM_PER_INCH + " na " + paperHeight * CM_PER_INCH);
    }
}
