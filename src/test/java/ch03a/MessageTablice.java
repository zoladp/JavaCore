package ch03a;

public class MessageTablice {
    public static void main(String[] args) {
        if(args[0].equals("-h")) System.out.print("Witaj. ");
        else if(args[0].equals("-g")) System.out.print("Żegnaj. ");
        //Wydruk pozostalych elementow wiersza polecen
        for (int i=1; i < args.length; i++) System.out.print(" "+args[i]);
        System.out.println("!");
    }
}
