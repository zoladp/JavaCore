package ch04a;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Jaro Rybak", 7500, 1987, 12, 15);
        staff[1] = new Employee("Zbych Okoń", 4500, 1965, 5, 25);
        staff[2] = new Employee("Anno Nowak", 5000, 1995, 2, 5);

        //zwiekszenie pensji wszystkim pracownikom o 5%
        for (Employee e : staff) {
            e.raiseSalary(12.52);
        }

        for (Employee e : staff)
        {
//            System.out.println(
//                    "name= "   + e.getName()   +
//                    "\tsalary+raise= " + (e.getSalary()-e.getRaise()) +
//                    " + ("+e.getPercent()+"%)"+e.getRaise() +
//                    "\tafter= " + e.getSalary() +
//                    "\thireday=" + e.getHireDay());
//            System.out.printf("name= %s\tsalary+raise= %.2f+(%.2f%%)=%.2f  after= %.2f  hireday= %6$tF %6$tr, dzien w roku: %6$tj\n",e.getName(),(e.getSalary()-e.getRaise()),e.getPercent(),e.getRaise(),e.getSalary(),e.getHireDay());
            System.out.printf("name= %s\tsalary+raise= %.2f+(%.2f%%)=%.2f  after= %.2f  hireday= %6$tF %6$tB %6$tB\n",e.getName(),(e.getSalary()-e.getRaise()),e.getPercent(),e.getRaise(),e.getSalary(),e.getHireDay());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private double raise;
    private double percent;
//    private Date hireDay;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
//        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
//        hireDay = calendar.getTime();
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

//    public Date getHireDay() {
//        return hireDay;
//    }
    public LocalDate getHireDay() { return hireDay; }

    public double getRaise() {
        return raise;
    }

    public double getPercent() {
        return percent;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        this.percent = byPercent;
        this.raise = raise;
        salary += raise;
    }

}
