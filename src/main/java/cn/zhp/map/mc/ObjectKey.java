package cn.zhp.map.mc;

import java.util.Date;

public class ObjectKey {
    private String aStr;
    private Integer bInt;
    private Date cDate;

    public String getaStr() {
        return aStr;
    }

    public void setaStr(String aStr) {
        this.aStr = aStr;
    }

    public Integer getbInt() {
        return bInt;
    }

    public void setbInt(Integer bInt) {
        this.bInt = bInt;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    @Override
    public String toString() {
        return "ObjectKey{" +
                "aStr='" + aStr + '\'' +
                ", bInt=" + bInt +
                ", cDate=" + cDate +
                '}';
    }
}
