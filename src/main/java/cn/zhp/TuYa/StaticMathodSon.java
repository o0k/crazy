package cn.zhp.TuYa;

public class StaticMathodSon extends StaticMathod {
/**
 * 静态方法不可被重写,也就不可被更改行为
 */
//    public String mm(){
//        return "qhw";
//    }

    public String noStaticMethod(){

        return "override no static method";
    }
}



class Tst {
    public static void main(String[] args) {
        StaticMathodSon son = new StaticMathodSon();
        /**
         * 可见,子类可以调用父类的类方法, 但不可以重写父类的类方法.
         */
        String mm = son.mm();
        System.out.println(mm);
    }
}
