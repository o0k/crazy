package cn.zhp.反射.test;

public class CalculatorTest {
    public static void main(String[] args) throws Exception{

        String str = "abc";
        String newStr = str.substring(1,2);

        System.out.println(newStr);

        Class<?> person = Class.forName("Person");


    }

}
