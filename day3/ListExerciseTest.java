package day3;

public class ListExerciseTest {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        for (String student: listExercise.getStudents()
             ) {
            System.out.println(student);
        }
    }
}
