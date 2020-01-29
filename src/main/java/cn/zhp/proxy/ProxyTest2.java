package cn.zhp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest2 {
    public static void main(String[] args) {

        Lenovo lenovo = new Lenovo();

        // ◆ 动态代理, 增强Lenovo对象
        /*
        Proxy.newProxyInstance(),创建代理对象,传三个对象,
        代理对象也要执行, 执行就需要类加载器,
        真实对象和代理对象,使用相同的类加载器,
        * */

        /**
         * 三个参数:
         *      1.类加载器:真实对象.getClass().getClassLoader().
         *      2.接口数组,保证了代理对象和真实对象,实现相同的功能.(保证代理对象和真实对象实现相同的接口)
         *      3.处理器:new InvocationHandler(),核心业务的处理
         */
        // 代理对象 和 真实对象 实现了相同的接口, 故可以强转.
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
            代理逻辑编写的方法,代理对象调用的所有方法都会触发该方法执行
            三个参数:
                proxy:代理对象,就是proxy_lenovo,一般不用
                method:将来要通过代理对象,调方法啊,你一调方法,
                        方法会被封装成一个对象,传到invoke()方法里面来,
                        就是Method对象,
                        ◆method:
                        就是代理对象调用的方法,被封装的对象
                args:代理对象调用方法时, 传递的实际参数




             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("该代理逻辑, 执行了-->>>>");

                // 判断是否是sale方法
                if (method.getName().equals("sale")) {
                    double money = (double) args[0];
                    // 1.增强参数
                    money = money * 0.85;
                    // 2.增强逻辑体
                    System.out.println("================逻辑体增强==S==============");
                    System.out.println("专车接送, 嘟嘟...");
                    // 使用真实对象,调用该方法
                    String result = (String) method.invoke(lenovo, money, 2); // 真正的方法操作是这句话,
                    System.out.println("免费安装..");
                    System.out.println("================逻辑体增强==E==============");
                    // 3.增强返回值
                    return result + ", 并送鼠标垫.";
                } else {
                    // 使用真实对象,调用该方法
                    Object result = method.invoke(lenovo, args);
                    return result;
                }
            }
        });


        // 代理对象,调用
        String computer = proxy_lenovo.sale(8000, 3);
        System.out.println(computer);
        //
        System.out.println();
        System.out.println("普通调用: ");
                proxy_lenovo.show("Mac Air");


        // 真实对象,调用
        //        String sale = lenovo.sale(8000);

        //        System.out.println(sale);
    }
}
