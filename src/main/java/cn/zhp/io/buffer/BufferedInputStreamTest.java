package cn.zhp.io.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTest {
    public static void main(String[] args) throws Exception{
        // 使用步骤

        // 1.
        FileInputStream in = new FileInputStream("src\\zhp\\bos.txt");
        // 2.
        BufferedInputStream bis = new BufferedInputStream(in);
        // 3.
        byte[] bytes = new byte[1024
                ];
        int len = 0;

        while((len = bis.read(bytes)) != -1) {
            System.out.println(len);
            System.out.println(new String(bytes,0,len));

        }

        // 4.
        bis.close();
    }
}
