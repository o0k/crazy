package cn.zhp.map.mc;

import cn.zhp.json.JacksonUtil;

import java.util.HashMap;
import java.util.Map;

public class ValueObj {
    public static void main(String[] args) {
        Map<Object, Object> mapA = new HashMap<>();
        Map<Object, Object> mapB = new HashMap<>();
        ZhpObj o1 = new ZhpObj();
        o1.setName("实事求是");
        o1.setAge(44);
        ZhpObj o2 = new ZhpObj();
        o2.setName("实事求是");
        o2.setAge(44);

        mapA.put("ak",o1);
        mapB.put("bk",o2);

        System.out.println(JacksonUtil.obj2json(mapA.get("ak")));
        System.out.println(JacksonUtil.obj2json(mapB.get("bk")));

        boolean equals = mapA.get("ak").equals(mapB.get("bk"));

        System.out.println(equals);


    }
}
