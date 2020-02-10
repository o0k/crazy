package cn.zhp.reflect;

import java.lang.reflect.InvocationTargetException;


import java.lang.reflect.*;

public class InvokeTest {


    public static void main(String[] args) {
        try {
            Class c = Class.forName("cn.zhp.reflect.User");
            Object o = c.newInstance();
            Method m = c.getMethod("getName", null);
            Object ret = m.invoke(o, null);
            System.out.println("com.java.jvm.User.getName() = " + ret);


            m = c.getMethod("setName", new Class[]{String.class});
            ret = m.invoke(o, new Object[]{"shengjian"});
            System.out.println("com.java.jvm.User.setName() = " + ret);


            m = c.getMethod("getName", null);
            ret = m.invoke(o, null);
            System.out.println("com.java.jvm.User.getName() = " + ret);

            //静态方法的调用
            m = c.getMethod("getUserName", new Class[]{String.class});
            ret = m.invoke(null, "fuwang");
            System.out.println("com.java.jvm.User.getUserName() = " + ret);

        } catch (ClassNotFoundException ex) {
            System.out.println("找不到此类别");
        } catch (NoSuchMethodException ex) {
            System.out.println("此方法不存在");
        } catch (IllegalAccessException ex) {
            System.out.println("没有权限调用此方法");
        } catch (InvocationTargetException ex) {
            System.out.println("调用此方法时发生下列例外:\n" + ex.getTargetException());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}

