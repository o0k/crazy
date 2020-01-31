package cn.zhp.io.zhuanHuanLiu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流:InputStreamReader
 *       OutputStreamWriter
 *
 *       ide默认的是UTF-8
 *
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/zhp/我是GBK格式的文本.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/zhp/我是GBK格式的文本Out.txt"));

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = isr.read()) != -1) {
            osw.write(len);
            System.out.print((char) len);
        }
        osw.flush();
        osw.close();
    }
}
