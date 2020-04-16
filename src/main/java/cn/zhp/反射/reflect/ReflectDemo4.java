package cn.zhp.反射.reflect;

import cn.zhp.反射.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        // 获取成员方法
        /*
            参数:1,方法名称
                 2,
         */

        Method method = personClass.getMethod("eat");
        // method, 执行方法
        Person person = new Person();
        Object invoke = method.invoke(person);// 这个方法没有参数, 传个对象过来就可以了

        //
        Method eat = personClass.getMethod("eat", String.class);
        Object pear = eat.invoke(person, "pear");





    }
}
