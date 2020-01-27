package cn.zhp.io;

import java.io.File;
import java.util.Arrays;

public class ZiWenJian {
    public static void main(String[] args) {
        printFile(new File("H:\\zhp"));
    }
    //                   ◆◆◆◆
    private static void printFile(File file) {
        if (file.isFile()) {
            System.out.println("你给定的不是文件夹");
        } else {
//            System.out.println("你给定的是文件夹,马上开干----->>>>>>");

            File[] files = file.listFiles();
//            System.out.println(Arrays.toString(files));

            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
                if (files[i].isDirectory()) {
                    // ◆◆◆◆
                    printFile(files[i]);
                }
            }
        }
    }
}
