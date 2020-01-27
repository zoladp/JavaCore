package ch04a;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class KlasaDate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);
        System.out.println(new Date());
        String s = new Date().toString();
        System.out.println(s);

        Date deadline = new Date();
        System.out.println("dead\t" + deadline);
        System.out.println(deadline.hashCode());

        Date ndate = new Date();

        if(deadline.before(ndate)) System.out.println("data jest przed");

        //Date klasa ta reprezentuje moment w czasie
        //Gregorian wyraza daty w znanej notacji kalendarzowej
        //Gregorian Calendar dziedziczy po klasie Calendar

        GregorianCalendar gc = new GregorianCalendar();
        GregorianCalendar gc2 = new GregorianCalendar(2018, Calendar.JULY,22,13,7,0);
        System.out.println(gc2.getTime());
        System.out.println("dzien1 "+gc2.get(Calendar.DAY_OF_MONTH));
        gc2.set(Calendar.DAY_OF_MONTH,15);
        System.out.println("dzien2 "+gc2.get(Calendar.DAY_OF_MONTH));
    }
}
