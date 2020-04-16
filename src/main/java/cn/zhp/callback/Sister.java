package cn.zhp.callback;


    /**
     * 姐姐,里面有个start函数,表示开始动筷子
     */
    public class Sister implements Start {
        public void start(){
            System.out.println("姐姐可以动筷子.");
        }
        @Override
        public void FatherStart(Object object) {
            if(object.toString().equals("父亲动了筷子")) {
                start();

                // https://www.jianshu.com/p/1fc6f5ddd484
            }
        }
    }

