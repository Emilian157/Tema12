package org.fasttrackit.exercise1;

import java.util.Map;

public class StudentWithHighestGrade {

    public static String highestStudentGrade(Map<String, Integer> studentGrades) {
        String highestStudentGrade = null;
        int highestGrade = 0;

        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            int grade = entry.getValue();

            if (grade > highestGrade) {
                highestGrade = grade;
                highestStudentGrade = student;
            }
        }

        return highestStudentGrade;
    }
}
