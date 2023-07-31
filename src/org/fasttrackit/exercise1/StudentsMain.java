package org.fasttrackit.exercise1;

import java.util.HashMap;
import java.util.Map;

public class StudentsMain {
    public static void main(String[] args) {

        Map<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("David", 85);
        studentGrades.put("Octavian", 92);
        studentGrades.put("Tony", 78);
        studentGrades.put("Tudor", 65);
        studentGrades.put("Eva", 89);

        System.out.println("Notele elevilor: ");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            int grade = entry.getValue();
            System.out.println(student + ": " + grade);
        }

        String highestGrade = StudentWithHighestGrade.highestStudentGrade(studentGrades);
        System.out.println("Elevul care are cea mai mare nota este: " + highestGrade);
    }
}
