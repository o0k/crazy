package cn.zhp.TuYa;

public class ThreadTest {
    static String text = "凡人问: 三观不和, 怎么过呀>?\n大师答: " +
            "没事,太阳还会照常升起,一切都会好起来的,冠状病毒也被控制的.\n";

    public static void main(String[] args) {
        for (char ch : text.toCharArray()) {
            try {
                Thread.sleep(400);
                System.out.print(ch);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
