package ch04.employee;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    //pola
    private final String name;
    private double salary;
    private double oldSalary;
    private Date hireDay;
    private static int nextID = 1;

    //konstruktor
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        oldSalary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }



    //metoda
    public String getName() { return name; }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public double getOldSalary() { return oldSalary; }

    public static int getNextID() { return nextID++; }

    public void raiseSalary(int byPercent) {
        double raise = this.salary * byPercent / 100;
        salary += raise;
    }


    //kolejne metody

}
