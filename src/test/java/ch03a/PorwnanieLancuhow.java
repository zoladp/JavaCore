package ch03a;

public class PorwnanieLancuhow {
    public static void main(String[] args) {
        String s1 = "jakis ciekawy tekst";
        String s2 = "jakis ciekawy teKst";
        String s3 = null;

        if(s1.equals(s2)) {
            System.out.println("tak, są rowne");
        } else System.out.println("nie, nie sa rowne");

        if (s1.equalsIgnoreCase(s2)) System.out.println("rowne");
        else {System.out.println("nie rowne");}

        if(s1.length()==0 || s1.equals("")) System.out.println("String jest pusty");
        else System.out.println("String NIE jest pusty");

        if(s3 == null) System.out.println("string jest nullem");
        else System.out.println("string NIE jest nullem");

        //sprawdzenie czy lancuch nie jest pusty czy nie jest nullem
        if(s2 != null && s2.length() != 0) System.out.println("string nie jest pusty ani nie jest nullem");


        String greeting = "Cześć!";
        int cpCount = greeting.codePointCount(0, greeting.length());
        int cpLength = greeting.length();
        System.out.println("cpCount: "+cpCount);
        System.out.println("cpLength: "+cpLength);
        char first = greeting.charAt(0);
        char last = greeting.charAt(4);
        System.out.println(first);
        System.out.println(last);

        StringBuilder sb = new StringBuilder();
        sb.append("hej tu ja nowy stringBuilder");
        System.out.println(sb);
        sb.append(greeting);
        System.out.println(sb);
        sb.insert(0,"how how how");
        System.out.println(sb);




    }
}
