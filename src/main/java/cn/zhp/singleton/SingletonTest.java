package cn.zhp.singleton;

/**
 * 饿汗模式
 */
public class SingletonTest {

    // 1.私有构造, 不允许外部直接创建对象
    private SingletonTest() {
    }

    // 2.要有一个实例, 自己创建一下,创建类的唯一实例,类成员
    /*
    static:类属性
    private:不允许外部使用
     */
    private static SingletonTest instance = new SingletonTest();

    // 3.提供一个用于获取实例的方法
    public static SingletonTest getInstance() {
         return instance;
    }
}
