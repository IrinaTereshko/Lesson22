package by.itstep.tia.controller;

import by.itstep.tia.model.data.Student;

public class SecondMain {

    // различие между примитивными и ссылочными типами данных
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a=20;
// создается еще одна ссылка, которая ссылается на один и тот же объект (адрес в памяти)
        Student student1 = new Student();
        Student student2 = student1;
        student1.name = "Anna";
        System.out.println( student2.name);

        // определение эквивалентности объектов

        
    }
}
