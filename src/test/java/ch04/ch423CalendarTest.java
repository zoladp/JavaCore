package ch04;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ch423CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
         int today = d.get(Calendar.DAY_OF_MONTH);
//         d.set(Calendar.MONTH,1);
         int month = d.get(Calendar.MONTH);

         //ustawienia d na poczatek miesiaca
        d.set(Calendar.DAY_OF_MONTH, 1);
//        d.set(today, 1);
        int weekday = d.get(Calendar.DAY_OF_WEEK);

        //pobranie pierwszego dnia tygodnia(Poniedzialek w PL)
        int firstDayOfWeek = d.getFirstDayOfWeek();

        //okreslenie odpowiedniego wciecia pierwszego wiersza
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        //drukowanie nazw dni tygodnia
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s",weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);
        System.out.println();

        for (int i = 1; i < indent; i++) {
            System.out.print("    ");
        }
        d.set(Calendar.DAY_OF_MONTH, 1);

        //drukowanie dni
        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
            //oznaczenie biezacego dnia znakiem (*)
            if (day == today) System.out.print("*");
            else System.out.print(" ");
            //ustawienie d na kolejny dzien
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

            //rozpoczecie nowego wiersza na poczatku tygodnia
            if ( weekday == firstDayOfWeek ) System.out.println();
        } while (d.get(Calendar.MONTH) == month); //petla konczy dzialanie jesli d jest pierwszym dniem nast. miesiaca

        //wydruk koncowego znaku nowego wiersza w razie potrzeby
        if (weekday != firstDayOfWeek) System.out.println();

        Object o = new Object();

        System.out.println();
        System.out.println(new Date());
//        Locale.setDefault(Locale.GERMAN);
        GregorianCalendar gcal = new GregorianCalendar(2019,6,27);
        gcal.set(Calendar.YEAR, 1978); //zmieniama w dacie rok z 2019 na 1978
        gcal.add(Calendar.MONTH, 3); //dodalem 3 miesiace do daty powyzej
        gcal.add(Calendar.MONTH, -5); //odjalem 5 miesiace do daty powyzej
        System.out.println(gcal.getTime()); //zwraca date 2019/6/27
        System.out.println(gcal.get(Calendar.DAY_OF_WEEK)); //zwraca nr dnia tyg. z daty powyzej. Numeracj 1-Nd, 2-Pon...itd.
        System.out.println(gcal.getFirstDayOfWeek()); //zwraca pierwszy dzien tygodnia 1-Sun, 2-Mon, itd
        System.out.println(gcal.get(Calendar.DAY_OF_YEAR));

    }
}
