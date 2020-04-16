package cn.zhp.反射.reflect;

import cn.zhp.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 可以创建任意类的对象,可以执行任意的方法
        //        Person p = new Person();
        //        p.eat();

        Student stu = new Student();
        stu.sleep();

        /*
            1.配置文件
            2.反射
         */
// 1.加载配置文件
        // 1.1.创建Properties对象
        Properties pro = new Properties();
        // 1.2.调用它的loader方法,加载它的配置文件
        /*
        加载配置文件,转换为一个集合,
        这个文件,得把它找到
         */
        // 1.2.1.要获取文件的路径 | 获取class目录下的配置文件

        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");// 获取这个资源对应的字节流
        pro.load(is);
// 2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

// 3.加载该类进内存
        Class cls = Class.forName(className);
// 4.new
        Object o = cls.newInstance();
// 5.获取方法对象
        Method method = cls.getMethod(methodName);
// 6.执行
        method.invoke(o);
    }
}
