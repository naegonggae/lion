package day3;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("이상훈");
        this.students.add("홍길동");

    }
    public List<String> getStudents() {
        return this.students;
    }
}
