package cn.zhp.io.buffer;

import java.io.File;
import java.io.FileInputStream;

/**
 * 缓冲流
 * 增强 字节流 和 字符流
 */
public class BufferedInputStream {

    public static void main(String[] args) throws Exception {
        String pathname = "src/zhp/b.txt";
        File file = new File(pathname);
        System.out.println(file.getAbsolutePath());
        new FileInputStream(file);
    }
}
