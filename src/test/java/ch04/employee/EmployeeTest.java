package ch04.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        //Wstawienie 3 obiektow pracownikow do tablicy staff
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jarosław Rybiński",75000,1987, 12,15);
        staff[1] = new Employee("Katarzyna Remiszewska", 6000, 1989, 10, 1);
        staff[2] = new Employee("Krystyna Kuczyńska", 40000, 1990, 3, 15);

        Employee worker = new Employee("James Bond",100000,1950,1,1);
        System.out.println(worker.getName()+"/ $"+worker.getSalary());

        //wyswietlenie obecnej pensji przed podwyzka
       /* for (Employee e : staff)
            System.out.println("name="+e.getName() + "\t\t\tsalary="+e.getSalary()+"\thireDay="+e.getHireDay());*/

        //Zwiekszanie pensji wszystkich pracownikow o 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name="+e.getName() + "\t\t\tsalary="+e.getSalary()+"\tpodwyzka="+(e.getSalary()-e.getOldSalary())+"\t\tthireDay="+e.getHireDay()+"\tnextID:"+e.getNextID());

        System.out.println(Math.PI);

    }
}
