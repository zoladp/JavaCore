package ch03;

public class Lancuchy {
    public static void main(String[] args) {
        String napis = "  Ja   va\u2122   ";
        System.out.println(napis);

        String e = ""; //pusty łancuch
        //e = null;
        String greeting = "Cześć!";
        System.out.println(napis);
        String ngreet = greeting.trim();
        System.out.println(napis);

        /** pod-lancuchy */
        String s = greeting.substring(0, 3) + "kaj"; //3 okresla polozenie znaku ktorego nie chcemy skopiowac
        System.out.println(s);

        /** porównywanie łańcuchów */
        //metoda equals do spr. czy 2 lancuchy sa identyczne

        if ("Cześć!".equals(greeting)) System.out.println("slowo jest identyczne");
        if ("CZeść!".equalsIgnoreCase("czeŚć!")) System.out.println("slowa sa identyczne");
        if (greeting == "Cześć!") System.out.println("sa rowne ale wynik moze sie zmieniac losowo, nie uzywaj == do porown. lancuchow");

        /** puste lancuchy */
        if(e.equals("")) System.out.println("lancuch jest pusty");
        if(e == "") System.out.println("lancuch jest pusty"); //nie zalecane uzywanie == do porown. lancuchow
        if(e == null) System.out.println("zmienna nie jest powiazana z zadnym obiektem");

        //sprawdzic czy lancuch nie jest pusty i nie jest null
        if(napis != null && napis.length() != 0) System.out.println("lancuch nie jest null, ani nie jest pusty");

        //
        String greet = "Cześć!";
        int n = greet.length();
        System.out.println("Liczba jednostek kodowych: "+n); //length zwraca liczbe jednostek kodowych z ktorych sklada sie podany lancuch w systemie UTF-16

        System.out.println(greet.codePointAt(5));
        System.out.println("\u0033");
        if(greet.endsWith("ć!")) System.out.println("jest!");

        greet = greet.replace("ść","kay");
        System.out.println(greet);



    }
}
