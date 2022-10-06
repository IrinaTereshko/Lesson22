package by.itstep.tia.model.data;

public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

// defailt constructor
    // если не добавим конструктор сами, то JVM сама создаст пустой дефолтный конструктор с обнуленными значениями
    // String = null, int = 0, double = 0.0, boolean = false
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
