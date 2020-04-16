package cn.zhp.callback;


/**
 * 儿子,里面有个start函数,表示开始动筷子
 */
public class Son implements Start {
    public void start() {
        System.out.println("儿子可以动筷子.");
    }

    @Override
    public void FatherStart(Object object) {
        if(object.toString().equals("父亲动了筷子")) {
            start();
        }
    }
}

