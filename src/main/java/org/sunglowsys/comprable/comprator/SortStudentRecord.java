package org.sunglowsys.comprable.comprator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStudentRecord {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(1, "B", "English"),
                new Student(4, "h", "Math"),
                new Student(5, "E", "JAVA"),
                new Student(6, "A", "HTML"));

        Collections.sort(students);
        students.forEach(System.out::println);


    }
}
