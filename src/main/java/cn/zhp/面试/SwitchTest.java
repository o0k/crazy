package cn.zhp.面试;

public class SwitchTest {
    public static void main(String[] args) {
        String flag = UtilZhp.getFlag();
        switch (flag) {
            case "1":
                doSomething1();
            case "2":
                doSomething2();
            default: break;
        }
    }

    static void doSomething1() {
        System.out.println("do some thing 1");
    }
    static void doSomething2() {
        System.out.println("do some thing 2");
    }

}


class UtilZhp {
    static String getFlag() {
        return "2";
    }
}
