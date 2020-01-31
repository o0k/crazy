package cn.zhp.TuYa;

import cn.zhp.domain.Person;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Zhp {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        // 获得方法
        Method method_eat = personClass.getMethod("eat");

        System.out.println("method_eat:" + method_eat);
        AnnotatedType annotatedReturnType = method_eat.getAnnotatedReturnType();
        Type type = annotatedReturnType.getType();
        System.out.println(type); // class java.lang.Integer


        Person person = new Person();

        // 执行方法
        method_eat.invoke(person);

        //
        Method method_eat2 = personClass.getMethod("eat", String.class);
        // 执行方法
        method_eat2.invoke(person," 大肉 ");
        System.err.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        String name = personClass.getName();
        System.out.println(name);


    }
}
