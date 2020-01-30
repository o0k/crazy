package cn.zhp.io.buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 缓冲流
 * 增强 字节流 和 字符流
 *
 * BufferedInputStream BufferedOutPutStream(字节缓冲流)
 * BufferedReader, BufferedWriter(字符缓冲流)
 */
public class BufferedOutputStreamTest {

    public static void main(String[] args) throws Exception {

        // BufferedOutputStream Extends OutputStream
        /*
        close,write,flush
         */
        FileOutputStream out = new FileOutputStream("src/zhp/bos.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
        bufferedOutputStream.write(97);
        bufferedOutputStream.flush();
        // ◆
        bufferedOutputStream.write("我是牛逼Class".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        /**
         *
         */


    }
}
