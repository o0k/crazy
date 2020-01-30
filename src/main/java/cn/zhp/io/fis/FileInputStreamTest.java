package cn.zhp.io.fis;

import java.io.FileInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) throws Exception{


        FileInputStream fileInputStream = new FileInputStream("src/zhp/b.txt");
        System.out.println(fileInputStream.read());
    }

}
