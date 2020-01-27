package cn.zhp.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            // 只写文件名,就是项目名下
            fileReader = new FileReader("a.txt");
            // read():
            int read = fileReader.read();
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
