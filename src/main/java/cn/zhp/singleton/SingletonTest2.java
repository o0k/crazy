package cn.zhp.singleton;

/**
 * 懒汉模式
 * 线程不安全
 */
public class SingletonTest2 {
    // 1.
    private SingletonTest2() {

    }

    // 2.声明实例
    private static SingletonTest2 instance;

    //
    public static SingletonTest2 getInstance(){
        if (instance == null) {
            instance = new SingletonTest2();

        }
        return instance;
    }
}
