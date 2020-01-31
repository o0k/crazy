package cn.zhp.TuYa;

import cn.zhp.domain.Person;

import java.lang.reflect.Field;

public class ZhangPeng {

    public static void main(String[] args) throws Exception{
    // 1.Class.forName()
        Class<?> cls1 = Class.forName("cn.zhp.domain.Person");
        System.out.println(cls1);
        // 2.类名.class
        Class<Person> cls2 = Person.class;
        // 3.实例.getClass()
        Person person = new Person();
        Class<? extends Person> cls3 = person.getClass();
        //....................................................
        //....................................................
        Field[] fields = cls2.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
        }

        // iter:输入foreach的快捷键
        Field field_a = cls1.getField("a");
        Object value = field_a.get(person);
        System.out.println(value);
        field_a.set(person,"张澎");
        System.out.println(person);

        // 暴力反射
        Field[] declaredFields = cls3.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field field_d = cls3.getDeclaredField("d");
        field_d.setAccessible(true);
        field_d.set(person,"朱晓红");
        Object value2 = field_d.get(person);

        System.out.println(value2);

    }
}
