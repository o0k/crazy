package cn.zhp.map;

import java.util.HashMap;
import java.util.Map;

public class ValueTst {


    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("sysHeader","aaay");
        map.put("commHeader","aaal");
        map.put("tranHeader","aaaw");

        Map<String, Object> mapSon = new HashMap<>();
        mapSon.put("sysHeader","aaay");
        mapSon.put("commHeader","aaal");
        mapSon.put("tranHeader","aaaw");

        map.put("mapSon", mapSon);

        map.put("aaa","bbb");






    }
}
