package cn.zhp.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Person {
    static List<String> list;

    public void eat() {
        System.out.println("我是eat()函数");
    }

    public String sayHello(String name) {
        return "hello,我是" + name + "!";
    }

    public String jump(String name, int age) {
        return "hello,我是" + name + ",我今年" + age + "岁了!";
    }

    public List<String> returnList() {
        // List<String> list = new ArrayList<String>();
        list = new ArrayList<String>();
        list.add("令狐冲");
        list.add("韦小宝");
        list.add("张无忌");
        list.add("杨过");
        list.add("乔峰");
        return list;
    }

    public static void main(String[] args) throws Exception {
        Class cla = Class.forName("cn.zhp.反射.Person");
        Constructor constructor = cla.getConstructor();
        Object obj = constructor.newInstance();
        Method[] declaredMethods = cla.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName() + " / " + method);
            Class[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length > 0) {
                System.out.print(method.getName() + "方法的参数类型:");
            } else {
                System.out.print(method.getName() + "方法没有参数");
            }
            for (Class parameterType : parameterTypes) {
                System.out.print(parameterType.getName() + "\t");
            }
            System.out.println("\n--------------------------------------------------");
        }
        System.out.println("******************************");
        // 使用反射，动态调用对象的函数
        Method method = cla.getMethod("eat");
        Object returnValue = method.invoke(obj);
        System.out.println(returnValue);
        // 动态调用对象的函数
        Method method2 = cla.getMethod("sayHello", String.class);
        Object returnValue2 = method2.invoke(obj, "令狐冲");
        System.out.println(returnValue2);
        // 动态调用对象的函数
        Method method3 = cla.getMethod("jump", String.class, int.class);
        Object returnValue3 = method3.invoke(obj, "令狐冲", 16);
        System.out.println(returnValue3);
        // 动态调用对象的函数
        Method method4 = cla.getMethod("returnList");
        Type returnType = method4.getGenericReturnType();
        System.out.println(method4.getName() + "方法的返回值类型=" + returnType);
        /*
         * returnList方法返回值类型是List<String>，所以returnValue4变量原本的类型是List<String>
         * 还有一个问题值得我们思考，每个方法的返回值类型都可能不一样，我们在利用反射调用完invoke()方法后，得到的返回值类
         * 型都是Object,怎么转换回每个方法它自己的原本的返回值类型呢?
         */
        Object returnValue4 = method4.invoke(obj);
        System.out.println("方法的返回值类型:" + method4.getReturnType().cast(method4.invoke(obj)));
        System.out.println(returnValue4 + " / " + returnValue4.getClass());
        for (String str : list) {
            System.out.println("利用反射自动调用完returnList方法后集合元素" + str);
        }
        List<String> returnValue5 = (List<String>) method4.invoke(obj);
        for (String string : returnValue5) {
            System.out.println(string);
        }

    }

}