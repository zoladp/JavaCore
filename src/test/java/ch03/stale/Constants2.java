package ch03.stale;

public class Constants2 {
    public static final double CM_PER_INCH = 2.54; //stala klasowa

    enum Rozmiar {MAŁY, ŚREDNI, DUŻY, EKSTRA_DUŻY}

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Rozmiar papieru w centymetrach: "
                + paperWidth * CM_PER_INCH + " na " + paperHeight * CM_PER_INCH);

        int x = 1;
        x = x + 4;
        x += 4;
        x++;
        x = 2 * ++x + 5;
        System.out.println(x);
        final String v = x != 0 ? "heja" : "uuu"; //warunek ? wyrazenie1 : wyrazenie2;
        System.out.println(v);

        double z = 4.49990;
        double w = Math.pow(3, z);
        double p = Math.sqrt(w);
        System.out.println("do potegi: " + w + ", pierwiastek kwadr: " + p);

        System.out.println("powierzchnia PL: 312000 km2, pierwiastek kw: " + Math.sqrt(312000));
        System.out.println("Sinus: " + Math.sin(20));
        System.out.println("PI: " + Math.PI);
        System.out.println("Euler: " + Math.round(z));

        int rz = (char) 300;

        System.out.println(rz);


        Rozmiar s = Rozmiar.ŚREDNI;
        System.out.println("enum: " + s);

        for (int i = 0; i < 10; i++) {

            System.out.println("Java\u2122");
        }

        System.out.println("a tangens: " + Math.atan2(3, 4));

    }
}


