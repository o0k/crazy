package cn.zhp.singleton;

public class Tst {
    public static void main(String[] args) {
//        new SingletonTest();

        SingletonTest instance1 = SingletonTest.getInstance();
        SingletonTest instance2 = SingletonTest.getInstance();

        System.out.print("饿汗,");
        if (instance1 == instance2) {
            System.out.println("是同一个实例");
        } else {
            System.out.println("不是同一个实例");
        }
        //

        SingletonTest2 instance3 = SingletonTest2.getInstance();
        SingletonTest2 instance4 = SingletonTest2.getInstance();
        if (instance3 == instance4) {
            System.out.println("懒汉,是同一个实例");
        } else {
            System.out.println("懒汉,不是同一个实例");
        }

        // https://www.imooc.com/video/1774






    }
}
