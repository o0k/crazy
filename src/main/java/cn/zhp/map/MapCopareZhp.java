package cn.zhp.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCopareZhp {
    public static void main(String[] args) {
        Map<String, Object> mapA = new HashMap<>();
        Map<String, Object> mapB = new HashMap<>();

        mapCompare(mapA,mapB);


    }
    public static void mapCompare(Map<String, Object> mapA, Map<String, Object> mapB) {
        Iterator<Map.Entry<String, Object>> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            String key = entry.getKey();
            Object value = entry.getValue();

        }


    }
}
