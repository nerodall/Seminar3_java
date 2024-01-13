import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparator<Date> {
    protected String fio;
    protected String position;
    protected int phone;
    protected int salary;
    protected int age;

    public Employee(String fio, String position, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(int salary, int age) {
        this.fio = "default";
        this.position = "default";
        this.phone = 100;
        this.salary = salary;
        this.age = age;
    }



    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    public void info(){
        System.out.println(this.toString());
    }
    public void info_format(){
        System.out.println(String.format("%s", this.toString()));
    }

    /**
     * Прототип компаратора
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Date o1, Date o2) {
        return o1.compareTo(o2);
    }
}