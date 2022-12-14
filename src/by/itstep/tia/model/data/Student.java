package by.itstep.tia.model.data;

public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

// defailt constructor
    // если не добавим конструктор сами, то JVM сама создаст пустой дефолтный конструктор с обнуленными значениями
    // String = null, int = 0, double = 0.0, boolean = false
// ЕСЛИ В КЛАССЕ ОПИСАН ХОТЬ ОДИН КОНСТРУКТОР, ТО ДеФОЛТНЫЙ КОНСТРУКТОР ПРИ КОМПИЛЯЦИИ НЕ СОЗДАЕТСЯ!!!
    public Student(){
        name = "no name";
        age = 16;
        mark = 4.0;
        alive = true;
    }
    // constructor with parameters  (all object conditions)
    public Student ( String n, int a, double m, boolean al) {
        name = n;
        age = a;
        mark = m;
        alive = al;

    }
// Затемнение параметров (имя поля и параметр передаваемый в конструктор объекта)
//    public Student ( String name, int age, double mark, boolean alive) {
//        name = name;
//        age = age;
//        mark = mark;
//        alive = alive;
//
    // Затемнение параметров не происходит, this - указание на свойство объекта (в нашем случае на имя поля)
 /*  public Student ( String name, int age, double mark, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;

   }*/

    // constructor with parameters (one object condition)
    public Student (String n) {
        name = n;
    }

    // copy constructor - (принимаемый параметр - это ссылочная переменная)
    public Student (Student student) {
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }

    public String getInfo() {
        return name
                + " age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }
}
