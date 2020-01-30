package cn.zhp.io.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferCopy {
    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("H:\\DOCX.docx"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/cn/zhp/io/buffer/abc.docx"));

        byte[] bytes = new byte[2];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes);
        }
        bis.close();
        bos.close();
        long e = System.currentTimeMillis();
        System.out.println("共耗时 " + (e-s) + "毫秒");
    }
}
