package ch03;

public class Message {
    public static void main(String[] args) {
        if (args[0].equals("-h"))
            System.out.print("Witaj. ");
        else if (args[0].equals("-g"))
            System.out.print("Żegnaj. ");
        //Wydruk pozostalych argumentow wiersza polecen
        for (int i = 1; i < args.length; i++) {
            System.out.print(" " + args[i]);
        }
        System.out.println("!");

    }
}
