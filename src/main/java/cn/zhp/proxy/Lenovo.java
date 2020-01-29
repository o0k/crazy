package cn.zhp.proxy;

/**
 * 真实类
 */
public class Lenovo implements SaleComputer {
    /**
     * 增强:
     * 参数,
     * 返回值,
     * 逻辑代码.
     * @param money
     * @return
     */
    @Override
    public String sale(double money,int count) {
        System.out.println("花了"+money*count+"元买了"+count+"台联想电脑.");
        return "Lenovo.sale()方法的返回值.|  联想电脑";
    }

    @Override
    public void show(String string) {

        System.out.println("展示电脑...");
    }

}
