package com.util;

import java.util.Vector;

// 21.
public class _21_TestMemory {
    public static void main(String[] args) {
        Vector vc = new Vector();
        for (int i = 1; i < 10; i++) {
            byte[] b = new byte[1024 * 1024];
            vc.add(b);
            System.out.println(i + "M is allocated");// (1)
        }
        System.out.println("Max memory : " + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M"); // (2)
    }
}
