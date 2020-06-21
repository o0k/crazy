package cn.zhp.ocjp._2;

public class Test {
    static int count = 0;
    int i = 0;

    public void changCount() {
        while (i<5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Test check1 = new Test();
        Test check2 = new Test();

        check1.changCount();
        check2.changCount();

        System.out.println(check1.count);
        System.out.println(check2.count);

    }
}
