package ch03a;

public class Konkatenacja {
    public static void main(String[] args) {
        String expletive = "brzydkieslowo";
        String PG13 = "PG";
        int age = 13;
        String rating = PG13+age;
        String message = expletive + rating;
        System.out.println(message);
        if((expletive.equals("brzydkie slowo ")) && "Cześć".equalsIgnoreCase("cześć")) System.out.println("rowne");
        else System.out.println("nierowne");
        char c = PG13.charAt(1);
        System.out.println(c);
        int cp = PG13.codePointAt(1);
        System.out.println(cp);
        int ocp = expletive.offsetByCodePoints(1,5);
        System.out.println(ocp);
        boolean sf = expletive.endsWith("wo ");
        if(sf) System.out.println("znajduje sie przyrostek");
        System.out.println(expletive.indexOf("z"));
        System.out.println(expletive.lastIndexOf("ie"));

        int bb = expletive.hashCode();
        System.out.println(bb);

    }
}
