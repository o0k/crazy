package cn.zhp.面试;

import java.util.Vector;

public class _20_VectorTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 1; i < 10; i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }
    }

}
