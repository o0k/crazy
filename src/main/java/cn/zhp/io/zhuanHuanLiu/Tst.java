package cn.zhp.io.zhuanHuanLiu;

import java.io.FileReader;

/**
 * 编码:
 * charset:编码表
 * ASCII字符集:ASCII编码
 * GBk字符集:GBK编码
 * Unicode字符集:UTF8编码,UTF16编码,UTF32编码
 */
public class Tst {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src/zhp/我是GBK格式的文本.txt");
        int len = 0;
        System.out.println("转char,是这样:");
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }

        fr.close();

    }

}
