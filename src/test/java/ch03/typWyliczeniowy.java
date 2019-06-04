package ch03;

public class typWyliczeniowy {
    enum Rozmiar {MAŁY, ŚREDNI, DUŻY}

    Rozmiar s = Rozmiar.ŚREDNI;
    Rozmiar n = null;

    public static void main(String[] args) {
        Rozmiar d = Rozmiar.DUŻY;
        Rozmiar m = Rozmiar.MAŁY;

        System.out.println(d);
        System.out.println(m);
    }
}
