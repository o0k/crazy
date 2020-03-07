package cn.zhp.map.mc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MapC {
    public static void main(String[] args) throws Exception {

        Map<Object, Object> mapA = new HashMap<>();
        Map<Object, Object> mapB = new HashMap<>();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateKey1 = sdf.parse("1980-06-01");
        Date dateKey2 = sdf.parse("1982-06-01");

        Date dateVal1 = sdf.parse("2021-08-08");
        Date dateVal2 = sdf.parse("2022-08-08");

        List<ZhpObj> list = new ArrayList<>();
        ZhpObj zo1 = new ZhpObj();
        zo1.setAge(80);
        zo1.setName("张澎");
        ZhpObj zo2 = new ZhpObj();
        zo2.setAge(100);
        zo2.setName("丁元英");
        list.add(zo1);
        list.add(zo2);
        List<ZhpObj> list2 = new ArrayList<>();
        ZhpObj zo12 = new ZhpObj();
        zo12.setAge(80);
        zo12.setName("张澎");
        ZhpObj zo22 = new ZhpObj();
        zo22.setAge(100);
        zo22.setName("丁元英");
        list.add(zo12);
        list.add(zo22);
        // key
        ObjectKey k1 = new ObjectKey();
        k1.setaStr("StrKey1");
        k1.setbInt(441);
        k1.setcDate(dateKey1);

        ObjectKey k2 = new ObjectKey();
        k2.setaStr("StrKey2");
        k2.setbInt(442);
        k2.setcDate(dateKey2);
        // vlue
        ObjectValue v1 = new ObjectValue();
        ObjectValue v2 = new ObjectValue();
        v1.setdStr("StrVal1");
        v2.setdStr("StrVal2");

        v1.setfInt(551);
        v2.setfInt(552);

        v1.setgDate(dateVal1);
        v2.setgDate(dateVal2);

        v1.setList(list);
        v2.setList(list2);

        mapA.put(zo1,dateVal1);
        mapA.put(zo2,dateVal2);
        mapA.put("key",list);




    }
}
