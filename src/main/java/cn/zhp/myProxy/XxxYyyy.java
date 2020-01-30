package cn.zhp.myProxy;

/**
 * 动态代理:
 *
 */
public class XxxYyyy implements MyInterface {


    @Override
    public String sale(double d, int count) {
        System.out.println("花了 " + d * count + "元, 买了 " + count + " 台苹果电脑.");
        return "搞到["+count+"]台苹果笔记本";
    }

    @Override
    public String show(String computer) {
        System.out.println("苹果体验店");
        return "MacBook Air";
    }
}
