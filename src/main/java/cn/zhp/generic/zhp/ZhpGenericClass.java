package cn.zhp.generic.zhp;

/**
 * 在创建实例的时候, 再给我指定他们是什么<>OneClass, OtherClass, AnotherClass</>
 * @param <OneClass>
 * @param <OtherClass>
 * @param <AnotherClass>
 */
public class ZhpGenericClass<OneClass, OtherClass, AnotherClass> {
    private OneClass oneClass;
    private OtherClass otherClass;
    private AnotherClass anotherClass;

    public ZhpGenericClass() {


    }

    public ZhpGenericClass(OneClass oneClass, OtherClass otherClass) {
        this.oneClass = oneClass;
        this.otherClass = otherClass;
    }

    public ZhpGenericClass(OneClass oneClass, OtherClass otherClass, AnotherClass anotherClass) {
        this.oneClass = oneClass;
        this.otherClass = otherClass;
        this.anotherClass = anotherClass;
    }

    public OneClass getOneClass() {
        return oneClass;
    }

    public void setOneClass(OneClass oneClass) {
        this.oneClass = oneClass;
    }

    public OtherClass getOtherClass() {
        return otherClass;
    }

    public void setOtherClass(OtherClass otherClass) {
        this.otherClass = otherClass;


    }

    // Generic Method :可以是静态方法, 也可以实例方法
    public <Another> Another getAnother(Object val) {
        return (Another) val; // 该方法的作用是: 你给我一个Object, 我把他强转成Another.
    }
    public static  <Another> Another getAnother2(Object val) {
        return (Another) val;
    }
}
