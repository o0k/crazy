package cn.zhp.reflect;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Zhp {
    Method method = ZhpInterface.class.getMethod("mthd", ZhpIn.class);

    public Zhp() throws NoSuchMethodException {
        System.out.println("zzzzzzzzzz");
        System.out.println("zzzzzzzzzz");
        System.out.println("zzzzzzzzzz");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Zhp zhp = new Zhp();

        AnnotatedType annotatedReturnType = zhp.method.getAnnotatedReturnType();
        System.out.println(annotatedReturnType);

        Object o = new Object();
        Class<?> aClass = o.getClass();

        zhp.method.getAnnotatedReturnType().getType();

//        invoke??????????????????



        Type t = zhp.method.getAnnotatedReturnType().getType();
        System.out.println(t);

        System.out.println(zhp.method.getAnnotatedReturnType());
        Type genericReturnType = zhp.method.getGenericReturnType();
        System.out.println(genericReturnType);
        System.out.println(zhp.method.getParameterTypes());

    }
}

interface ZhpInterface {
    ZhpOut mthd(ZhpIn zhpIn);
}

class ZhpOut {

}
class ZhpIn {

}

