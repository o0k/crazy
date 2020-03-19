package cn.zhp.面试;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        String a = null;
        List<String> data = new ArrayList<>();
        data.add(null);
        data.add(a);
//        data.add(98,a);
//        data.set(101,new String("171"));
        for (String datum : data) {
            System.out.println(datum);
        }
        // null,null,null,171

    }
}
