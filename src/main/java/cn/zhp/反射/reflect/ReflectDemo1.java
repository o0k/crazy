package cn.zhp.反射.reflect;

import cn.zhp.反射.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo1 {
    /*
     *   类创建好,之后,一保存,他就自动编译了,.class文件也就有了.
     *
     */
    public static void main(String[] args) {
        try {
            //1.Class.forName("全类名");  多用于配置文件
            Class cls1 = Class.forName("cn.zhp.反射.domain.Person");
            System.out.println(cls1);
            //2.类名.class    多用于参数的传递
            Class<Person> cls2 = Person.class;
            System.out.println(cls2);
            //3.对象.getClass()   有对象了,获取字节码文件
            Person p = new Person();
            Class cls3 = p.getClass();
            System.out.println(cls3);

            // 比较三者的内存地址,如果内存地址相同,则认为相同
            System.out.println(cls1 == cls2);
            System.out.println(cls1 == cls3);
            System.out.println(cls2 == cls3);
            // 三个true,证明这三个引用,指向堆内存中,同一个对象

            /**
             * 同一个字节码文件(Person.class),在一次程序运行过程中,只会被加载一次,
             * 不论用哪种方式获取的Class对象都是同一个.
             */

            // Class对象功能 获取功能:
            /*
            1.获取成员变量
            2.获取构造方法
            3.
            4.
             */
            Field[] fields = cls1.getFields();
            Field name = cls1.getField("name");

            Field age = cls1.getDeclaredField("age");
            Field[] declaredFields = cls1.getDeclaredFields();

//            cls1.getConstructor()
            Constructor[] constructors = cls1.getConstructors();

            Constructor[] declaredConstructors = cls1.getDeclaredConstructors();
//            cls1.getDeclaredConstructor()

            Method[] methods = cls1.getMethods();
//            cls1.getMethod()

//            cls1.getDeclaredMethod()
            Method[] declaredMethods = cls1.getDeclaredMethods();

            String name1 = cls1.getName();


        } catch (ClassNotFoundException | NoSuchFieldException e) {

            e.printStackTrace();
        }
    }

}
