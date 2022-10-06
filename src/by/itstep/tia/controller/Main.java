package by.itstep.tia.controller;

import by.itstep.tia.model.data.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("anna", 17, 6.0, true);
        Student student3 = new Student("inna");
        Student student4 = new Student(student2);

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student4.getInfo());
    }
}
