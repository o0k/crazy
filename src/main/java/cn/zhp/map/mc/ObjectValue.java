package cn.zhp.map.mc;

import java.util.Date;
import java.util.List;

public class ObjectValue {
    private String dStr;
    private List<ZhpObj> list;
    private Integer fInt;
    private Date gDate;

    public String getdStr() {
        return dStr;
    }

    public void setdStr(String dStr) {
        this.dStr = dStr;
    }

    public List<ZhpObj> getList() {
        return list;
    }

    public void setList(List<ZhpObj> list) {
        this.list = list;
    }

    public Integer getfInt() {
        return fInt;
    }

    public void setfInt(Integer fInt) {
        this.fInt = fInt;
    }

    public Date getgDate() {
        return gDate;
    }

    public void setgDate(Date gDate) {
        this.gDate = gDate;
    }

    @Override
    public String toString() {
        return "ObjectValue{" +
                "dStr='" + dStr + '\'' +
                ", list=" + list +
                ", fInt=" + fInt +
                ", gDate=" + gDate +
                '}';
    }
}
