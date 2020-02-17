package ch04.employee2;

import java.time.LocalDate;

public class EmployeeSingle {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public EmployeeSingle(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(int byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
