package cn.zhp.面试;

public class Counts {
    private int count;
    public static void main(String[] args) {
        Counts cs = new Counts(999);
        System.out.println(cs.count);
    }

    private Counts(int b) {
        count = b;
    }
}
