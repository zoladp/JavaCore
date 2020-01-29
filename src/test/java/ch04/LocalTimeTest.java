package ch04;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.util.stream.IntStream.of;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime czas = LocalTime.now();
        System.out.println(czas);
        System.out.println(czas.plusMinutes(30));
        System.out.println(czas);
        System.out.println(czas.getHour());
        System.out.println(czas.getMinute());
        System.out.println(czas.getSecond());

        LocalDate data = LocalDate.now();
        System.out.println(data);
        System.out.println(data.getDayOfYear());
        System.out.println(data.getDayOfMonth());
        System.out.println(data.getDayOfWeek());
        System.out.println(data.getEra());
        System.out.println(data.getYear());
        System.out.println(data.getMonth());

        LocalDate Sylwester = LocalDate.of(1978,7,27);
        System.out.println(Sylwester.getDayOfWeek().plus(1000));
        System.out.println(Sylwester.getMonth());

        LocalDate EwaDOB = LocalDate.of(1983,12,6);
        EwaDOB = EwaDOB.plusDays(1000);
        System.out.println(EwaDOB.getDayOfWeek());
    }
}
