package ch03;

public class typWyliczeniowy {
    enum Rozmiar {MAŁY, ŚREDNI, DUŻY};

    Rozmiar s = Rozmiar.ŚREDNI;

    public static void main(String[] args) {
        Rozmiar d = Rozmiar.DUŻY;
    }
}
