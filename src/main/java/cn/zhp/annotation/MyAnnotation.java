package cn.zhp.annotation;

    /**
     * 其本质:
     *      public interface MyAnnotation extends java.lang.Annotation {}
     *
     *      其本质就是接口,接口中能定义啥,这里就能定义啥
     */
public @interface MyAnnotation {

//    public abstract String show();

    /**
     * 属性:接口中的抽象方法
     * 要求:属性的返回值类型
     *  属性返回值类型
     *  1.String
     *  2.基本类型
     *  3.枚举
     *  4.注解
     *  5.以上都可以
     *
     */

    int show1();
    int age();
    String name() default "张澎"; // 你不给我name赋值,就叫张澎
    Person per();
    String[] strs();

        /* 如果只有一个属性, 并且这个属性叫value的话,这个名称可以省略,注解后面括号里,直接写值就好了 */
/**
 * 暂时注释掉, 用的话, 再放开
    int i();
    Person per();
    OtherAnnotation anno2();
    String[] strs();
 */

    // Invalid type "NormalClass" for annotation member.
    // NormalClass nc();

        /**
         * 定义了属性, 在使用的时候,要赋值
         */




    }
