package cn.zhp.io.buffer;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("src\\main\\java\\cn\\zhp\\io\\buffer\\c.txt");
        boolean exists = file.exists();
        System.out.println(exists);

        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        // 1.创建流对象
        FileInputStream fis = new FileInputStream("c.txt");
        // 2.调用read()方法读取数据，并把数据显示在控制台
        int read = fis.read();

        System.out.println(read);

        // 3.
    }
}
