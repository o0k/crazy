package cn.zhp.io;

import java.io.File;

public class ZiWenJian2 {
    public static void main(String[] args) {
        printFile(new File("H:\\zhp"),1);
    }

    public static void printFile(File file, int tab) {
        if (file.isFile()) {
            System.out.println("您给定的是一个文件"); // 判断给定目录是否是一个合法的目录，如果不是，输出提示
        } else {
            File[] fileLists = file.listFiles(); // 如果是目录，获取该目录下的内容集合

            for (int i = 0; i < fileLists.length; i++) { // 循环遍历这个集合内容
                for (int j = 0; j < tab; j++) {        //输出缩进
                    System.out.print("|---");
                }

                System.out.println(fileLists[i].getName());    //输出元素名称

                if (fileLists[i].isDirectory()) {    //判断元素是不是一个目录
                    printFile(fileLists[i], tab + 1);    //如果是目录，继续调用本方法来输出其子目录，因为是其子目录，所以缩进次数 + 1
                }
            }
        }
    }
}
