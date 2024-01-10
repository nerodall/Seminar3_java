import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();



        employees.add(new Employee(10000, 25));
        employees.add(new Employee(12000, 30));
        employees.add(new Employee(10000, 35));
        employees.add(new Employee(30000, 40));
        employees.add(new Employee(50000, 55));
        employees.add(new Manager("Федоров А.А.","Директор",79855,100_000,60));

        System.out.println(employees);
        System.out.println();

        Manager.changeSalary(employees,39,1000000000);
        System.out.println(employees);

    }
}
