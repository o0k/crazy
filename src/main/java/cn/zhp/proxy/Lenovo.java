package cn.zhp.proxy;

/**
 * 真实类
 */
public class Lenovo implements SaleComputer {

    @Override
    public String sale(double money) {
        System.out.println("花了"+money+"元买了台联想电脑.");
        return "null";
    }

    @Override
    public void show() {
        System.out.println("展示电脑...");
    }

}
