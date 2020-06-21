package cn.zhp.ocjp._3;

public class StringLowSub {
    public static void main(String[] args) {
        String string = "0123456789";
        String substring = string.substring(1, 5);

        System.out.println(substring);

        mm();

    }

    private static void mm() {
        String product = "Pen";
        String s = product.toLowerCase();
        System.out.println(s);
        String concat = s.concat(" Box".toLowerCase());
        String substring = concat.substring(4, 6);
        System.out.println(substring);
    }
}
