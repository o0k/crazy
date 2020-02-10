package cn.zhp.spdb;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

public class HowToUseMethod {

    public static void main(String[] args) throws Exception{
        Method method = HowToUseMethod.class.getDeclaredMethod("test");
        System.out.println(method);

        AnnotatedType t2 = method.getAnnotatedReturnType();
        System.out.println(t2);

//        method.invoke()
        // ◆ invoke()方法.


    }

    public String test() {
        return null;
    }

}
