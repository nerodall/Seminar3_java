import java.util.ArrayList;

public class Manager extends Employee{
    public Manager(String fio, String position, int phone, int salary, int age) {
        super(fio, position, phone, salary, age);
    }

    /**
     * Метод для повышения ЗП всем, кроме руководителя
     * @param employees список сотрудников
     * @param age возраст с которого нужно повысить ЗП
     * @param increase сумма повышения ЗП
     */
    public static void changeSalary(ArrayList<Employee> employees, int age, int increase){
        for (Employee item: employees){
            if(item.getAge() > age && !item.getClass().getName().equals("Manager")){
                item.setSalary(item.getSalary()+increase);
            }
        }
    }
}
