package ch04.employee;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    //pola
    private String name;
    private double salary;
    private Date hireDay;

    //konstruktor
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    //metoda
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(int byPercent) {
        double raise = salary * byPercent / 100;
//        salary = salary + raise;
        salary += raise;
    }

    //kolejne metody

}
