package cn.zhp.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)  // 我们自己定义的,一般都取这个值
@Documented
@Inherited
public @interface MyAnno {
    /**
     * @Retention(RetentionPolicy.RUNTIME):当前被描述的注解,会保留到class字节码文件中,并被jvm读取到
     * @Retention(RetentionPolicy.ClASS):会保留到class字节码中,但不会被jvm虚拟机读取到
     * @Retention(RetentionPolicy.SOURCE):连字节码文件中都不会有
     */
}
