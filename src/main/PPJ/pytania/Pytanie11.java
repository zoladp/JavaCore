package PPJ.pytania;

public class Pytanie11 {
    public static void main(String[] args) {
        Integer[] it = {1,2,3};
        String[] st = {"jeden","dwa","trzy"};

        show(it);
        show(st);
    }

    private static void show(String[] st) {
        for(String s : st)
            System.out.println(s);
    }

    private static void show(Integer[] it) {
        for(int i: it) {
            System.out.print(i);
        }
            System.out.println();
    }
}
