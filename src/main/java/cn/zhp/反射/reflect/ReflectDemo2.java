package cn.zhp.反射.reflect;

import cn.zhp.反射.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        /**





         */

        Class<Person> personClass = Person.class;
        //...........................public....
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field a = personClass.getField("a");
        System.out.println(a);
        // 获取成员变量之后,操作之
        /*
        get(Object obj)
         */
        Person person = new Person();
        person.a = "印度阿三";
        Object value = a.get(person);

        System.out.println(value);

        a.set(person, "美国无赖");
        System.out.println(person.a);

        System.out.println(person);

        // IllegalAccessException:非法的访问异常
        Field d = personClass.getDeclaredField("d");
         /*
         访问非public成员变量时,
         要先忽略访问权限修饰符的安全检查
         // d.setAccessible(true);
          */
        d.setAccessible(true);
        Object value2 = d.get(person);
        System.out.println(value2);

        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);

        // 获取构造方法
    }
}
