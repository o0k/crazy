package cn.zhp.map;

import org.mybatis.spring.annotation.MapperScan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@MapperScan
public class MapTst {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        map.put("sysHeader","aaay");
        map.put("commHeader","aaal");
        map.put("tranHeader","aaaw");

        System.out.println(map);

        // KeySet 获取 key
        for (String s : map.keySet()) {
            System.out.println(s);
        }

        // values 获取 value
        for (Object value : map.values()) {
            System.out.println(value);
        }
        // keySet get(key) 获取key and value
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }


        // entrySet 获取key and value
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }

        // Iterator entrySet 获取key and value
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            System.out.println(entry.getKey() + ":::" + entry.getValue());
            // it.remove(); 删除元素
        }

        // Lambda 获取key and value
        map.forEach((key, value) -> {
            System.out.println(key + "::::" + value);
        });

        Map<String, Object> map2 = new LinkedHashMap<>();

        map2.put("sysHeader","aaa");
        map2.put("commHeader","aaa");
        map2.put("tranHeader","aaa");

        System.out.println(map2);




    }
}
