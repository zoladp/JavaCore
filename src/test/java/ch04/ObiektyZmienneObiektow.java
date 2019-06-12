package ch04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ObiektyZmienneObiektow {
    public static void main(String[] args) {
        String d = new Date().toString();
        System.out.println(d);

        Date birthday = new Date(78,6,27);
        //birthday = null;
        String s = birthday.toString();

        Date deadline;
        deadline = new Date();
        deadline = birthday;
        d = deadline.toString();
        System.out.println(d);

        /*if (today.before(birthday))
            System.out.println("Jest jescze czas na kupienie prezentu");*/

        GregorianCalendar gc = new GregorianCalendar(1999,11,31);
        GregorianCalendar gc2 = new GregorianCalendar(2001, Calendar.JANUARY,31,23,50,31);

        System.out.println(gc2.getTime());
        System.out.println(gc2.DAY_OF_WEEK);
        gc2.set(Calendar.DAY_OF_WEEK,5);
        System.out.println(gc2.DAY_OF_WEEK);


    }
}
