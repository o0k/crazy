package cn.zhp.annotation;

import java.lang.reflect.Method;

@Pro(className = "cn.zhp.annotation.Class1", methodName = "method1")
public class ProAnnotationTest {

    public static void main(String[] args) throws Exception {
        // 1.解析注解
        // 1.1.获取该类的字节码文件对象
        Class<ProAnnotationTest> thisClazz = ProAnnotationTest.class;

        /**
         * getAnnotations(),获取该类上的所有注解
         * getAnnotation(Class<> 指定的某个注解)
         */
        // 2.获取上边的注解对象
        Pro annotation = thisClazz.getAnnotation(Pro.class); // annotation 对象也获取到了
        /**
         * 上边这行相当于, 注解这个接口的一个实现类的对象
         *  public class ProImpl implements Pro {
         *      public String className(){
         *          return "cn.zhp.annotation.Class1";
         *      }
         *      public String methodName(){
         *          return "method1";
         *      }
         *  }
         */

        /**
         * 对象拿到了,方法可以去调用一下
         */
        // 3.调用注解对象中定义的抽象方法,获取返回值 (就是注解的属性,就是一些抽象方法)
        String s = annotation.className();
        String s1 = annotation.methodName();
        System.out.println("当当当当,注解的值拿到了:");
        System.out.println(s);
        System.out.println(s1);

        // 4.加载该类进内存
        Class<?> cls = Class.forName(s);

        // 5.创建对象
        Object o = cls.newInstance();

        // 6.获取方法
        Method method = cls.getMethod(s1);

        // 7.执行方法
        Object invoke = method.invoke(o);



    }
}


