package by.itstep.tia.controller;

import by.itstep.tia.model.data.Student;
import by.itstep.tia.model.logic.Manager;

public class Controller {
    public static void main(String[] args) {


        Student student1 = new Student("anna", 17, 8.0, true);
        Student student2 = new Student("anna", 17, 9.0, true);
        Student student3 = new Student("anna", 17, 10.0, true);

        Student[] students ={student1, student2, student3};

        double result = Manager.calcAvgStudentMark(students);

        System.out.println( result);
        }
    }

