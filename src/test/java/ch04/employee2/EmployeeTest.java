package ch04.employee2;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Robert Siwiak", 5000, 1960, 6, 12);
        staff[1] = new Employee("Jacek Cydejko", 4500, 1970, 4, 1);
        staff[2] = new Employee("Mariusz Roman", 5900, 1960, 3, 13);

        for (Employee e : staff) {
            System.out.println(
                    "name = " + e.getNaame() +
                    ", salary = " + e.getSalary() +
                    ", hire day = " + e.getHireDay()
            );
        }
        System.out.println("*********************************************");
        for (Employee e : staff) e.raiseSalary(5);
        for (Employee e : staff) {
            System.out.println(
                            "name = " + e.getNaame() +
                            ", salary = " + e.getSalary() +
                            ", hire day = " + e.getHireDay());
        }
    }
}



 class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getNaame() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(int byPercent) {
        double raise = salary * byPercent / 100;
//        this.raise = raise;
        salary += raise;
    }
}

