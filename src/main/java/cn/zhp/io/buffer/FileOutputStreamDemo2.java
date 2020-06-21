package cn.zhp.io.buffer;

import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {

    public static void main(String[] args) throws Exception {
        // 1.创建流对象
        FileOutputStream fos = new FileOutputStream("c.txt");

        // 2.



        // 2.关闭流对象
        fos.close();
    }
}
