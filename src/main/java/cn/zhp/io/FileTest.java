package cn.zhp.io;

import java.io.File;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) {

        String pathname = "H:\\zhp";
        File file = new File(pathname);


        String[] list = file.list();

        System.out.println(Arrays.toString(list));
        System.out.println(list.length);


    }
}
