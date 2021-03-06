package cn.zhp.generic.define;

// >> TODO 定义泛型，就是把需要的类型定义在类后面的尖括号里，然后在类里面就可以把定义好的泛型像符号一样使用

/**
 * First 和 Second: 就像占位符一样, 就像标识一样.
 * 具体是什么,我也不知道
 * 只有两个名字不一样, 我能区分开, 用的时候用就可以了
 * @param <First>
 * @param <Second>
 */
public class MyGenericClass<First, Second> {

    // >> TODO 实际上这两个引用都是Object类型的
    private First first;

    private Second second;

    public MyGenericClass(First first, Second second) {
        this.first = first;
        this.second = second;
    }

    public First getFirst() {
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }


    public <Another> Another getAnother(Object val) {
        return (Another) val;
    }

}
