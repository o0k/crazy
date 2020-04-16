package cn.zhp.反射.domain;

public class Person {

    public void eat() {
        System.out.println("吃货!!!");
    }
    public void eat(String food) {
        System.out.println("吃货!!! 吃" + food);
    }

    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
