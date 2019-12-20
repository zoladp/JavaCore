package ch03;

public class PodLancuchy {
    public static void main(String[] args) {
        String greetings = "Czescioow";
        greetings = greetings.substring(0,3)+"kaj";
        greetings.toUpperCase(); //imutable example
        System.out.println(greetings.toUpperCase());
        System.out.println(greetings.charAt(1));
        String greet1 = greetings.substring(2);
        String greet2 = greetings.substring(2,5);
        String grt2 = greetings.substring(0,greetings.length()/2);
        greet1 = "cos cos tam";
        System.out.println(greet1);
        System.out.println(greet2);
        System.out.println(grt2);

    }
}
