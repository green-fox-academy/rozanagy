import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name; //the name of the cohort
    List<Student> students; // list of Students
    List<Mentor> mentors; // list of Mentors

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
