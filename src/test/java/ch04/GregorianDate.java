package ch04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GregorianDate {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl"));
        GregorianCalendar gcToday = new GregorianCalendar();
        System.out.println(gcToday.getTime());
        int month = gcToday.get(Calendar.MONTH);
        int weekday = gcToday.get(Calendar.DAY_OF_WEEK);
        System.out.println(month+" / "+weekday);

        GregorianCalendar deadline = new GregorianCalendar();
        System.out.println("1 "+deadline.getTime());
        deadline.set(Calendar.YEAR,2001);
        deadline.set(Calendar.MONTH,3);
        System.out.println("2 "+deadline.getTime());


        GregorianCalendar gcCustom = new GregorianCalendar(1999, Calendar.FEBRUARY,27,13,15,00);
        System.out.println(gcCustom.getTime());

        Date hireDay = gcCustom.getTime();
        System.out.println("hireDay"+hireDay);
    }
}
