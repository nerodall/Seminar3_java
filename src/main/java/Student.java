import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    private String name;
    private List<Double> grades;
    private String specialty;
    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    private Double getAvarageGrade(){
        if (!grades.isEmpty()) {
            Double result = 0.0;
            for (Double item : grades) {
                result += item;
            }
            return result/grades.size();
        }
        return (double) 0;
    }

    /**
     * Метод для нахождения первых 5 студентов со средним баллом 4.5 и выше, специальности "Информатика"
     * @param students
     * @return Лист со студентами
     */
    public static List<Student> getAbgGrade(ArrayList<Student> students){
        return students.stream()
                .filter(e -> e.getSpecialty().equalsIgnoreCase("информатика"))
                .filter(e  -> e.getAvarageGrade() > 4.5)
                .sorted(Comparator.comparing(Student::getAvarageGrade).reversed())
                .limit(5)
                .collect(Collectors.toList());

}


}
