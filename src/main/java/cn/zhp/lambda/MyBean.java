package cn.zhp.lambda;

import java.util.Date;

/**
 * @Author zhp_e
 * @Date 22年10月16日, 0016 14:07
 * @Version 1.0
 */
public class MyBean {
    private String name;
    private int age;

    private Date date;

    public MyBean(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public MyBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
