import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Marco", 23);
        Student student2 = new Student("Gaia", 24);
        Student student3 = new Student("Ugo", 20);
        Student student4 = new Student("Mario", 24);
        Student student5 = new Student("Clara", 22);
        Student student6 = new Student("Maria", 21);
        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2));
        System.out.println(students);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        System.out.println("List updated " + students);

    }
}
