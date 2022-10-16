package cn.zhp.lambda;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author zhp_e
 * @Date 22年10月16日, 0016 14:04
 * @Version 1.0
 */
public class LambdaTest {
    public static void main(String[] args) {
        MyBean myBean0 = new MyBean("zhp0", 18, new Date());
        MyBean myBean1 = new MyBean("zhp1", 19, new Date());
        MyBean myBean2 = new MyBean("zhp2", 20, new Date());
        ArrayList<MyBean> myBeans = new ArrayList<>();
        myBeans.add(myBean0);
        myBeans.add(myBean1);
        myBeans.add(myBean2);
        // 1. lambda表达式 分组
        // 1.1 无参
        myBeans.forEach(myBean -> System.out.println(myBean.getName()));
        // 1.2 有参
        myBeans.forEach(myBean -> {
            System.out.println(myBean.getName());
            System.out.println(myBean.getAge());
        });
        // 2. lambda表达式 排序
        // 2.1 无参
        myBeans.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        // 2.2 有参
        myBeans.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        // 3. lambda表达式 过滤
        // 3.1 无参
        myBeans.stream().filter(myBean -> myBean.getAge() > 18).forEach(myBean -> System.out.println(myBean.getName()));
        // 3.2 有参
        myBeans.stream().filter(myBean -> {
            return myBean.getAge() > 18;
        }).forEach(myBean -> System.out.println(myBean.getName()));

        // 分组




    }
}
