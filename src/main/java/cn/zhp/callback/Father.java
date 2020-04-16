package cn.zhp.callback;

/**
 * 父类,里面有个start函数,表示开始动筷子
 */
public class Father {
    private Sister sister;
    private Son son;

    public Father(Son son, Sister sister) {
        this.sister = sister;
        this.son = son;
    }

    public void start(){
        System.out.println("父亲开始动筷子.");

        son.FatherStart("父亲动了筷子");
        sister.FatherStart("父亲动了筷子");
    }
}
