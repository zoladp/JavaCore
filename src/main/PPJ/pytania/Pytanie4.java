package PPJ.pytania;

public class Pytanie4 {
    public static void main(String[] args) {
        System.out.println(g(5));
    }
    private static int g(int n) {
        if(n==0) return n;
        return n - g(n-1);
    }
}
