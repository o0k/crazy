package cn.zhp.反射.reflect;

import cn.zhp.反射.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        // 获取构造方法
        /*
            构造方法的不同,在于参数的不同,
            里面传的就是构造方法的class对象
         */

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        /*
            构造方法是用来创建对象的,
         */
        Person person = constructor.newInstance("李四", 25);
        System.out.println(person);

        // Class.forName()获得的class,newInstance()得到的是Object
        Class<?> cls = Class.forName("cn.zhp.反射.domain.Person");
        Constructor<?> constructor1 = cls.getConstructor(String.class, int.class);
        Person o = (Person)constructor1.newInstance("张澎", 40);
        System.out.println(o);

        // 空参构造,可简化操作
        Person person1 = personClass.newInstance();
        System.out.println(person1);

    }
}
