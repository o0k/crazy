package cn.zhp.lambda;

/**
 * @Author zhp_e
 * @Date 22年10月16日, 0016 14:03
 * @Version 1.0
 */
public class LambdaDemo {
    public static void main(String[] args) {
        // 1. 无参无返回值
        Runnable r = () -> System.out.println("hello world");
        r.run();
        // 2. 有参无返回值
        // 2.1 一个参数
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.test1(1);
        // 2.2 多个参数
        lambdaDemo.test2(1, 2);
        // 3. 有返回值
        // 3.1 一个参数
        int test3 = lambdaDemo.test3(1);
        System.out.println(test3);
        // 3.2 多个参数
        int test4 = lambdaDemo.test4(1, 2);
        System.out.println(test4);
    }

    private void test2(int i, int i1) {
        System.out.println(i + i1);
    }

    private int test3(int i) {

        return i;
    }

    private int test4(int i, int i1) {
        return 0;
    }

    private void test1(int i) {
    }
}
