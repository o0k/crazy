package cn.zhp.io;
/**
 * 先收下原理:
        第一个线程 读取0-2500
        第二个线程读取 2500-5000
        .......
 */
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int num = 10000;
        int thread = 4;// 线程数
        final List<Email> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Email e = new Email();
            e.setUsername(i + "");
            list.add(e);
        }

        final int avg = num / thread;// 每个线程读取的邮件数量
        List<Thread> listThreads = new ArrayList<>();
        for (int i = 0; i < thread; i++) {
            // 四个线程一起工作
            final int count = i;
            /*
            listThreads.add(new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < avg; j++) {
                        int number = j + count * avg;// 邮件的编号
                        System.out.println(list.get(number).getUsername());
                    }
                }
            });
             */
// 用lambda表达式表示

        }
        for (int i = 0; i < thread; i++) {
            listThreads.get(i).start();
        }
    }
}