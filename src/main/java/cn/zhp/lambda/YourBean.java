package cn.zhp.lambda;

import java.util.Date;

/**
 * @Author zhp_e
 * @Date 22年10月16日, 0016 14:31
 * @Version 1.0
 */
public class YourBean {
    private String goodName;
    private int age;

    private Date date;

    private String billDateStr;

    private Integer goodAccount;

    public YourBean(String name, int age, Date date, String billDateStr, Integer goodAccount) {
        this.goodName = name;
        this.age = age;
        this.date = date;
        this.billDateStr = billDateStr;
        this.goodAccount = goodAccount;
    }

    public YourBean() {
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
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

    public String getBillDateStr() {
        return billDateStr;
    }

    public void setBillDateStr(String billDateStr) {
        this.billDateStr = billDateStr;
    }

    public Integer getGoodAccount() {
        return goodAccount;
    }

    public void setGoodAccount(Integer goodAccount) {
        this.goodAccount = goodAccount;
    }

    public Integer getGoodAmount() {
            return 0;
    }
}

