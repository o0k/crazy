package cn.zhp.callback;

/**
 * 接口回调
 */
public final class App {
    public static void main(String[] args) {
        new Father(new Son(),new Sister()).start();
    }
}
