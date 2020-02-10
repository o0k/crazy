package cn.zhp.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Demo2 {
    public void test01(Map<String, User> map, List<User> list, int id) {
        System.out.println("Demo2.test01");
    }

    public Map<Integer, User> test02() {
        System.out.println("Demo2.test02");
        return null;
    }

    public void test03(int a, String s) {
        System.out.println("Demo2.test03");
    }

    public static void main(String[] args) throws Exception {
        Method m = Demo2.class.getDeclaredMethod("test01", Map.class, List.class, int.class);
        Type[] type = m.getGenericParameterTypes();//获取方法的参数类型。
        for (Type paramType : type) {
            System.out.println("#" + paramType);
            //ParameterizedType:参数化类型，判断是否是参数化类型。
            if (paramType instanceof ParameterizedType) {
                //获得源码中的真正的参数类型
                Type[] genericType = ((ParameterizedType) paramType).getActualTypeArguments();
                for (Type gt : genericType) {
                    System.out.println("泛型类型：" + gt);
                }
            }
        }

        System.out.println("###########。。华丽的分隔线。。############");

        Method method = Demo2.class.getDeclaredMethod("test02");
        Type t = method.getGenericReturnType();//获取返回值类型。
        System.out.println("#" + t);
        if (t instanceof ParameterizedType) {
            Type[] genericType = ((ParameterizedType) t).getActualTypeArguments();
            for (Type gt : genericType) {
                System.out.println("泛型类型：" + gt);
            }
        }
    }
}