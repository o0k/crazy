package cn.zhp.map;

import java.util.HashMap;
import java.util.Map;

public class MapCompareValue {
    /**
     *
     * @param hashMap 原数据
     * @param hashMap2 需要比较的数据
     * @return
     */
    private static boolean mapCompar(HashMap<Object,Object> hashMap, HashMap<Object,Object> hashMap2) {
        boolean isChange = false;
        for (Map.Entry<Object, Object> entry1 : hashMap.entrySet()) {
            String m1value = entry1.getValue() == null ? "" : (String) entry1.getValue();
            String m2value = hashMap2.get(entry1.getKey()) == null ? "" : (String) hashMap2.get(entry1.getKey());
            if (!m1value.equals(m2value)) {
                isChange = true;
            }
            System.out.println(isChange);
        }
        return isChange;
    }
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("key1", "key1");
        hashMap.put("key2", "key2");
        hashMap.put("key3", "key3");
        HashMap<Object, Object> hashMap2 = new HashMap<>();
        hashMap2.put("key1", "key1");
        hashMap2.put("key2", "key2");
        mapCompar(hashMap,hashMap2);
    }
}

