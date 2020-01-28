package cn.zhp.generic.zhp;

import java.util.List;

public class KeyBoard extends Zi {
    public String string;
    private Integer integer;

    protected List list;
    Fu fu;

    public static void main(String[] args) {
        new KeyBoard().method3();
        // F2
        System.out.println("balabala");
        int a = 2, b = 5;




        //
        if (a > b) {
            // Ctrl+Shfit+Enter 自动补全
        }

        // new ZhpGenericClass<>().var+Tab
        ZhpGenericClass<Object, Object, Object> objectObjectObjectZhpGenericClass = new ZhpGenericClass<>();
    }

    public void method1() {


        System.out.println("ddd");
    }

    public void method2() {
        System.out.println("ddd");
        for (int i = 0; i < 10; i++) {
            System.out.println("abc" + i);


            integer = i;

        }
    }

    public void method3() {
        integer = 40;

        System.out.println("ddd");
    }
}
