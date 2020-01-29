package PPJ;

public class Pytanie03 {

}

class Sprawdzian {
    public static void main(String[] args) {
        Sprawdzian s = new Sprawdzian();
        s.fun(5);
    }

    private long fun(int n) {
g        long wynik=(n==0)?0: (n+(fun(n-1)));
        System.out.print("n:"+n+" ");
        System.out.println(wynik);
        return wynik;
    }
}