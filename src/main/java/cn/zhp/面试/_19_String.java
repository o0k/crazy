package cn.zhp.面试;

public class _19_String {
    public static void main(String[] args) {
        int a1 = 0, a2 = 0, a3 = 0, a4 = 0;
        int b1 = 0, b2 = 0, b3 = 0, b4 = 0;
        a1 = a1 ++ + ++ a1;
        a2 = ++a2 + a2++ + a2++ + a2++;
        a3 = a3++ + a3++ + a3++ + ++a3;
        a4 = ++a4 + ++a4;
        b3 = ++ b1;
        b4 = b2++;
        System.out.print(a1 + ";");
        System.out.print(a2 + ";");
        System.out.print(a3 + ";");
        System.out.print(a4 + ";");

        System.out.print(b1 + ";");
        System.out.print(b2 + ";");
        System.out.print(b3 + ";");
        System.out.print(b4 + ";");
    }
}
