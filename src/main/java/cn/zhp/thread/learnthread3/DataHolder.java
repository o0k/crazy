package cn.zhp.thread.learnthread3;

/**
 * 同步:synchronized
 *
 */
public class DataHolder {

    // 任何一个对象,都可以做锁,不是null就可以
    private Object lockObj = new Object();

    private long number = 0;
    private static long numberStatic = 0;

    // TODO 一个synchronized解决问题
    public synchronized void change(long delta) {
        number += delta;
    }

    public void changeSyncBlock(long delta){
        int abc = 99;
        synchronized (lockObj){
            number += delta;
        }
        int cde = 987;
    }

    // TODO 一个synchronized解决问题
    public synchronized static void changeStatic(long delta) {
        numberStatic += delta;
    }

    public void print() {
        System.out.println("Number=" + number);
    }

    public static void printStatic() {
        System.out.println("static Number=" + numberStatic);
    }

}
