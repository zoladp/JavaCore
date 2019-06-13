package ch04.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        //Wstawienie 3 obiektow pracownikow do tablicy staff
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jarosław Rybiński",75000,1987, 12,15);
        staff[1] = new Employee("Katarzyna Remiszewska", 50000, 1989, 10, 1);
        staff[2] = new Employee("Krystyna Kuczyńska", 40000, 1990, 3, 15);

        //Zwiekszanie pensji wszystkich pracownikow o 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name="+e.getName() + " ,salary="+e.getSalary()+" ,hireDay="+e.getHireDay());
    }
}
