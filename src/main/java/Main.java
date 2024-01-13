import java.util.ArrayList;
import java.util.List;

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


        ArrayList <Student> students = new ArrayList<>();

        List<Double> alexGrades = new ArrayList<>();
        alexGrades.add(5.0);
        alexGrades.add(4.0);
        students.add(new Student("Alex",alexGrades,"nano"));

        List<Double> katyaGrades = new ArrayList<>();
        katyaGrades.add(5.0);
        katyaGrades.add(2.0);
        students.add(new Student("Katya",katyaGrades,"Информатика"));


        List<Double> viktorGrades = new ArrayList<>();
        viktorGrades.add(5.0);
        viktorGrades.add(5.0);
        students.add(new Student("Viktor",viktorGrades,"Информатика"));

        ArrayList<Student> resultList = new ArrayList<>(Student.getAbgGrade(students)) ;
        System.out.println(resultList.size());
        System.out.println(resultList);

    }
}
