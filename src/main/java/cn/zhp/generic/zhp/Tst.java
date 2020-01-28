package cn.zhp.generic.zhp;

import java.lang.reflect.Field;
/*
泛型:就相当于在生产class文件的时候, 他给我们插进去这个强转的命令.

其实,他只是在编译的时候帮我们做了这样一个检查,这个信息并没有带到生成的class 文件里面去



 */
public class Tst {
    public static void main(String[] args) throws NoSuchFieldException {

        Field fieldOneClass = ZhpGenericClass.class.getDeclaredField("oneClass");
        Class<?> type = fieldOneClass.getType();
        System.out.println("type 到底是什么类型: " + type);// class java.lang.Object

        // 使用泛型
        ZhpGenericClass<String, Object, Integer> inst1 = new ZhpGenericClass<>("inst1", new Object(), 18);
        //

        // 这个返回值并不知道, 主要是看你前面是什么,前面是什么,其返回值就是什么
//        System system = inst1.getAnother(""); // 这里会报错
//        Integer integer = inst1.getAnother("");
        String another = inst1.getAnother("");

//        String ss = (String) inst1.getAnother(new Object());

        //



    }
}
