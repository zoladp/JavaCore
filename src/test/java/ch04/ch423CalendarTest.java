package ch04;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ch423CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
         int today = d.get(Calendar.DAY_OF_MONTH);
         int month = d.get(Calendar.MONTH);

         //ustawienia d na poczatek miesiaca
        d.set(Calendar.DAY_OF_MONTH, 1);
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
            System.out.print("     ");
        }
        d.set(Calendar.DAY_OF_MONTH, 1);

        //drukowanie dnia
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
    }
}
