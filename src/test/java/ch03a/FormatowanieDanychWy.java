package ch03a;

import java.util.Date;

public class FormatowanieDanychWy {
    public static void main(String[] args) {
        double x = 11000.0 / 3.0;
        double y = -10000.0 / 3.0;
        int z  = 45;
        System.out.println(x);
        System.out.printf("%f\n",x);
        System.out.printf("%,#011.2f ujemna %(,020.3f %d\n",x,y,z);
        System.out.printf("%1$#011.2f / %1$(,020.3f / %1$,099.5f\n",x);
        //Date
        System.out.printf("%1$tc | %1$tr | %1$tR | %1$tA | dzien w roku %1$tj | liczba sekund od 1970 %1$ts | liczba miliSekund od 1970 %1$tQ | nanosekundy %1$tN |",new Date());
    }
}
