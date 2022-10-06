package by.itstep.tia.model.logic;

import by.itstep.tia.model.data.Student;

public class Manager {
    public static double calcAvgStudentMark (Student[] students) {
        double s = 0;

        for (Student student: students) {
            s+=student.mark;
        }
        return s/students.length;
    }
}
