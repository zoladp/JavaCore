package ch04a;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatyCzasy {
    public static void main(String[] args) {
//        System.out.println(getCurrentDateDmy());
        System.out.println(getLocalDate(6));
    }

    public static String getCurrentDateDmy() {
        Date today = new Date();
        System.out.println(today.toString());
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        return DATE_FORMAT.format(today);
    }

    public static String getLocalDate(int minusMonths) {
        LocalDate a = LocalDate.now().minusMonths(minusMonths);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String text = a.format(formatter);
        return text;
    }
}
