package cn.zhp.myProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Tst {
    public static void main(String[] args) {

        XxxYyyy xxxYyyy = new XxxYyyy();


        // 要害全在这里
        MyInterface proxyInstance = (MyInterface) Proxy.newProxyInstance(xxxYyyy.getClass().getClassLoader(), xxxYyyy.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理对象的invoke(),也是第三个参数的实现-->>>>");

                String invoke = (String)method.invoke(xxxYyyy, 8000, 10);

                System.out.println("invoke: " + invoke);

                return invoke;
            }
        });
        // 要害全在这里

        proxyInstance.sale(8000, 4);
    }
}
