package ch03;

public class TypWyliczeniowy {
    enum Rozmiar {MAŁY, ŚREDNI, DUŻY}
    enum PizzaSize {Small,Medium,Large,XtraLarge,SuperXtraLarge}

    Rozmiar s = Rozmiar.ŚREDNI;
    Rozmiar n = null;

    public static void main(String[] args) {
        Rozmiar d = Rozmiar.DUŻY;
        Rozmiar m = Rozmiar.MAŁY;

        System.out.println(d);
        System.out.println(m);

        PizzaSize ps = PizzaSize.SuperXtraLarge;
        String info = ps.getClass().toString();
        System.out.println(info);
        System.out.println(ps+"\u2122");
    }
}
