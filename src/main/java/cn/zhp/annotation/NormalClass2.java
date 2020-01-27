package cn.zhp.annotation;


@MyAnnotation(age = 10, show1 = 78, name = "李逵", per = Person.P2, strs = "ss")
public class NormalClass2 {
    /**
     * 元注解:
     * 就是注解上面的注解
     * @Target(ElementType.METHOD) :可以作用在方法上
     * @Retention(RetentionPolicy.SOURCE) :保留到源码中
     *
     * Retention:描述注解被保留的阶段
     * Documented:注解是否被抽取到api文档中
     * Target:注解能够作用的位置
     * Inherited:描述注解是否被子类继承(如果加了这个注解,子类会自动的继承父类的这个注解.)
     */


}