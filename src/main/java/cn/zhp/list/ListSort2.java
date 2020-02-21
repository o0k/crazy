package cn.zhp.list;

import java.util.ArrayList;
import java.util.List;


class Student2 {

    private String name;

    private double age;

    public Student2(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Perosn [name=" + name + ", age=" + age + "]";
    }
}

public class ListSort2 {

    public static void main(String[] args) {

        List<Student2> list = new ArrayList<>();

        list.add(new Student2("abc", 12.124));
        list.add(new Student2("bcd", 20.214));
        list.add(new Student2("cde", 17.321));
        list.add(new Student2("def", 25.145));
        list.add(new Student2("efg", 15.145));

        list.sort((x, y) -> Double.compare(x.getAge(), y.getAge()));//这方法需要jdk1.8以上
        // str.compareTo(str2)

        for (Student2 stu : list) {
            System.out.println(stu);
        }
    }
}

