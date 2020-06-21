package cn.zhp.io.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamTest {
    public static void main(String[] args) throws Exception {
        mm();
        return;
    }

    private static void mm() throws IOException {
        // 使用步骤

        // 1.
        FileInputStream in = new FileInputStream("src\\zhp\\bos.txt");
        // 2.
        BufferedInputStream bis = new BufferedInputStream(in);
        // 3.
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = bis.read(bytes)) != -1) {
            System.out.println(len);
            System.out.println(new String(bytes, 0, len));

        }

        // 4.
        bis.close();
    }
}
