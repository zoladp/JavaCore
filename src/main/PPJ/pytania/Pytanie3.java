package PPJ.pytania;

public class Pytanie3 {
    public static void main(String[] args) {
        Pytanie3 s = new Pytanie3();
        s.fun(5);
    }

    private long fun(int n) {
        long wynik=(n==0)?0: (n+(fun(n-1)));
        System.out.print("n:"+n+" ");
        System.out.println(wynik);
        return wynik;
    }
}