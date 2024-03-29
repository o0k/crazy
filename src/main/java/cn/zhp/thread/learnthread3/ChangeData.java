package cn.zhp.thread.learnthread3;

public class ChangeData implements Runnable {

    private long delta;

    private long loopCount;

    private DataHolder dataHolder;

    public ChangeData(long delta, long loopCount, DataHolder dataHolder) {
        this.delta = delta;
        this.loopCount = loopCount;
        this.dataHolder = dataHolder;
    }


    @Override
    public void run() {
        for (int i = 0; i < loopCount; i++) {
//            dataHolder.change(delta);
            DataHolder.changeStatic(delta);
        }
//        dataHolder.print();
        DataHolder.printStatic();
    }
}