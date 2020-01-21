package ch03a;

import java.util.Date;

public class FormatowanieDanych {
    public static void main(String[] args) {
        int i = 156456;
        //tworze sformatowany tekst i go wyswietl
        System.out.printf("dec %d, hex %1$x, oct %1$o\n",i);

        String wiad = "Witaj świecie ";
        //aby stworzyc sformatowany tekst ale go zapisac do zmiennej
        String message = String.format("%s o numerze %d stan na %tD %3$tA",wiad,i,new Date());
        System.out.println(message);
    }
}
