package PPJ;

public class PPJ01Wierszyk {
    public static void main(String[] args) {
        String tresc =
                "\nKiedy Puchacz i Kicia wyruszyli w rejs ?ycia" +
                        "\nW zgrabnej ??dce groszkowozielonej" +
                        "\nWzi?li z sob? par?wki, du?y zapas got?wki" +
                        "\nI s??j miodu z nalepk? \"The Honey\"." +
                        "\n    Edward Lear (t?. S.Bara?czak) (\u00B1 \u00AE)\n";
        //   ?      ?
        System.out.println(tresc);

        Object o = new Object();
        System.out.println("o.toString() = " + o.toString());

        int a = 22;

        // Uwaga na pu?apki
        System.out.println("a = " + a);
        System.out.println("a + 1 = " + a + 1);
    }
}
