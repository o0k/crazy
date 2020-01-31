package cn.zhp.TuYa;

import cn.zhp.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 反射 {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;

        try {
            Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
            System.out.println(constructor);
            // 创建对象
            Person 大牛 = constructor.newInstance("大牛", 40);
            System.out.println(大牛);
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            Constructor<Person> constructor1 = personClass.getConstructor();
            System.out.println(constructor1);
            // 再创建对象
            Person person = constructor1.newInstance();
            System.out.println(person);
            //
            Person person1 = personClass.newInstance();
            System.out.println(person1);
            // constructor1.setAccessible(true);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
