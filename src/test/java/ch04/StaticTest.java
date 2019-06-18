package ch04;


public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tomasz", 40000);
        staff[1] = new Employee("Dariusz", 60000);
        staff[2] = new Employee("Grzegorz", 65000);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + " ,id=" + e.getId() + " ,salary=" + e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println("Nastepny dostepny identyfikator="+n);
    }
}

class Employee
{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Grzegorz", 50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
