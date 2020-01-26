package cn.zhp.io;

import java.io.File;

public class IoTest {
    public static void main(String[] args) {
        System.out.println("问问");
        // 文件夹
        File file1 = new File("/Users/zhangpeng/Documents/crazy/src/main/java/cn/zhp/io/");
        System.out.println(file1);
        // 文件
        File file = new File("/Users/zhangpeng/Documents/crazy/src/main/java/cn/zhp/io/ioTest.txt");


        System.out.println(file);

        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        String parent = file.getParent();
        System.out.println(parent);


    }
}
