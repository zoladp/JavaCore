package PPJ;

import java.util.Scanner;

public class PPJ05UlamkiBabilonskie {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Ulamek zero = new Ulamek();
        Ulamek one = new Ulamek(1);

        while (true) {
            Ulamek u; //Ułamek rozkładany na składniki "babilońskie"

            System.out.print("\nPodaj ułamek: licznik/mianownik: ");
            u = Ulamek.readUlamek(scn);

            if (Ulamek.eq(u, zero)) break;  // Normalne zakończenie programu
            if (Ulamek.lt(u, zero)) {
                System.out.println("Tylko liczby nieujemne!");
                continue;
            }

            //Tu wyznaczamy rozkład
            // (1) Część całkowita
            System.out.print(u + " = ");
            if (u.gt(one)) {
                long whole = u.getLicznik() / u.getMianownik();
                System.out.print(whole);
                u = u.sub(new Ulamek(whole));
                if (u.gt(zero)) System.out.print(" + ");
            }

            // (2) Rozkład ułamka wg konwencji babilońskiej
            while (u.ne(zero)) {
                long mian = 2; //minimalny mianownik
                Ulamek bab = new Ulamek(1, mian);
                while (bab.gt(u)) {
                    ++mian;
                    bab = new Ulamek(1, mian);
                }
                System.out.print(bab);
                u = u.sub(bab);
                if (u.gt(zero)) System.out.print(" + ");
            }
            System.out.println();
        }
        scn.close();
        System.out.println("KONIEC PROGRAMU");

    }
}


class Ulamek implements Comparable<Ulamek> {
    public static int liczbaInstancji = 0;
    private long l, m; // licznik, mianownik

    // Inicjuje składowe l, m obiektu według argumentów a, b;
    // postać znormalizowana ułamka: nieskracalna, m >=0.
    private void initUlamek(long a, long b) {
        ++liczbaInstancji;
        long d = nwp(a, b);
        if (b < 0) {
            a = -a;
            b = -b;
        }      // Mianownik zawsze nieujemny
        l = a / d;
        m = b / d;
    }

    // 4 wersje konstruktorów
    public Ulamek(long a, long b) {
        initUlamek(a, b);
    }

    public Ulamek(long a) {
        initUlamek(a, 1);
    }

    //public Ulamek(long a) { this(a, 1); }      // Równoważny z powyższym
    public Ulamek() {
        initUlamek(0, 1);
    }

    //public Ulamek() { this(0, 1); }            // Równoważny z powyższym
    public Ulamek(Ulamek u) {
        initUlamek(u.l, u.m);
    }
    //public Ulamek(Ulamek u) { this(u.l, u.m); }// kopiuj�cy - Równowa�ny z powyższym

    public long getLicznik() {
        return l;
    }

    public long getMianownik() {
        return m;
    }

    public void setLicznik(long nowyl) {
        initUlamek(nowyl, this.m);
    }

    public void setMianownik(long nowym) {
        initUlamek(this.l, nowym);
    }

    public static Ulamek add(Ulamek a, Ulamek b) {
        long tl, tm;
        if (a.m == 0 && b.m == 0) {
            tl = (a.l + b.l) / 2;
            tm = 0;
        } else {
            tl = a.l * b.m + a.m * b.l;
            tm = a.m * b.m;
        }
        return new Ulamek(tl, tm);
    }


    public Ulamek add(Ulamek b) {
        return Ulamek.add(this, b);
    }

    public Ulamek sub(Ulamek b) {
        long tl, tm;
        if (this.m == 0 && b.m == 0) {
            tl = (this.l - b.l) / 2;
            tm = 0;
        } else {
            tl = this.l * b.m - this.m * b.l;
            tm = this.m * b.m;
        }
        return new Ulamek(tl, tm);
    }

    public static Ulamek sub(Ulamek a, Ulamek b) {
        return a.sub(b);
    }

    public Ulamek mul(Ulamek b) {
        long d1, d2;
        d1 = nwp(this.l, b.m);
        d2 = nwp(this.m, b.l);
        return new Ulamek((this.l / d1) * (b.l / d2), (this.m / d2) * (b.m / d1));
    }

    public static Ulamek mul(Ulamek a, Ulamek b) {
        return a.mul(b);
    }

    public Ulamek div(Ulamek b) {
        long d1, d2;
        d1 = nwp(this.l, b.l);
        d2 = nwp(this.m, b.m);
        return new Ulamek((this.l / d1) * (b.m / d2), (this.m / d2) * (b.l / d1));
    }

    public static Ulamek div(Ulamek a, Ulamek b) {
        return a.div(b);
    }

    public Ulamek neg() {
        return new Ulamek(-this.l, this.m);
    }

    public static Ulamek neg(Ulamek a) {
        return new Ulamek(-a.l, a.m);
    }

    // Medianta pary liczb wymiernych
    public static Ulamek med(Ulamek a, Ulamek b) {
        return new Ulamek(a.l + b.l, a.m + b.m);
    }

    public Ulamek med(Ulamek b) {
        return med(this, b);
    }

    // Relacje eq, ne, gt, ge, lt, le
    public static boolean eq(Ulamek a, Ulamek b) {
        return a.sub(b).l == 0;
    }

    public static boolean ne(Ulamek a, Ulamek b) {
        return !Ulamek.eq(a, b);
    }

    public static boolean gt(Ulamek a, Ulamek b) {
        return a.sub(b).l > 0;
    }

    public static boolean ge(Ulamek a, Ulamek b) {
        return !lt(a, b);
    }

    public static boolean lt(Ulamek a, Ulamek b) {
        return a.sub(b).l < 0;
    }

    public static boolean le(Ulamek a, Ulamek b) {
        return !gt(a, b);
    }

    public boolean eq(Ulamek b) {
        return eq(this, b);
    }

    public boolean ne(Ulamek b) {
        return ne(this, b);
    }

    public boolean gt(Ulamek b) {
        return gt(this, b);
    }

    public boolean ge(Ulamek b) {
        return !lt(this, b);
    }

    public boolean lt(Ulamek b) {
        return lt(this, b);
    }

    public boolean le(Ulamek b) {
        return !gt(this, b);
    }

    public String toString() {
        String str = "" + this.l;
        if (this.m != 1)
            str += "/" + this.m;
        return str;
    }

    // Realizacja interfejsu Comparable<Ulamek>
    public int compareTo(Ulamek u) {
        Ulamek dif = this.sub(u);
        return (int) dif.l;
    }

    // -----
    // Najwiekszy wspólny podzielnik
    public static long nwp(long p, long q) {
        long t;
        p = Math.abs(p);
        q = Math.abs(q);  // nwp zawsze dodatni

        if (p == 0)
            if (q == 0) return 1;
            else return q;
        else if (q == 0) return p;

        // p>0, q>0
        while ((t = p % q) != 0) {
            p = q;
            q = t;
        }
        return q;
    }

    // -----
    // Metoda czytania Ulamka ze strumienia spodziewa się
    // postaci: licznik albo licznik/mianownik
    public static Ulamek readUlamek(Scanner is) {
        String s = is.next();
        String[] ss = s.split("/");
        long mianownik = 1;

        long licznik = Integer.parseInt(ss[0]);
        if (ss.length > 1) mianownik = Integer.parseInt(ss[1]);
        return new Ulamek(licznik, mianownik);
    }

}