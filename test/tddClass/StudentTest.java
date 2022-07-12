package tddClass;

import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void setUp(){
        Student student = new Student("Betty", 93.5);
        Student student2 = new Student( "Adejoke", 72.75);

        System.out.printf("%s's letter grade is: %s%n",
                student.getName(), student.getLetterGrade());
        System.out.printf("%s's Letter grade is: %s%n",
        student2.getName(), student2.getLetterGrade());
    }
}
