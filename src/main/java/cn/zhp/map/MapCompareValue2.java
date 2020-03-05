package cn.zhp.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCompareValue2 {
    /**
     * 用map的keySet()的迭代器(性能效率较低)
     *
     */
    public  void compareMap1 (){

        Map<String, String> m1 = new HashMap<String, String>();//小
        Map<String, String> m2 = new HashMap<String, String>();//大

        Iterator<String> iter1 = m1.keySet().iterator();

        while (iter1.hasNext()) {
            String m1Key = (String) iter1.next();
            if (!m1.get(m1Key).equals(m2.get(m1Key))) {//若两个map中相同key对应的value不相等
                //......
            }
        }

    }
    /**
     * 用map的entrySet()的迭代器(性能效率较高)
     */
    public void compareMap2(){
        Map<String, String> m1 = new HashMap<String, String>();
        Map<String, String> m2 = new HashMap<String, String>();

        Iterator<Map.Entry<String, String>> iter1 = m1.entrySet().iterator();
        while(iter1.hasNext()){
            Map.Entry<String, String> entry1 = (Map.Entry<String, String>) iter1.next();
            String m1value = entry1.getValue() == null?"":entry1.getValue();
            String m2value = m2.get(entry1.getKey())==null?"":m2.get(entry1.getKey());

            if (!m1value.equals(m2value)) {//若两个map中相同key对应的value不相等
                //其他操作...
            }
        }
    }
    /**
     * 用map的entrySet()的增强型for循环(性能效率较高)
     */
    public void compareMap3(){
        Map<String, String> m1 = new HashMap<String, String>();
        Map<String, String> m2 = new HashMap<String, String>();

        for(Map.Entry<String, String> entry1:m1.entrySet()){
            String m1value = entry1.getValue() == null?"":entry1.getValue();
            String m2value = m2.get(entry1.getKey())==null?"":m2.get(entry1.getKey());
            if (!m1value.equals(m2value)) {//若两个map中相同key对应的value不相等
                //其他操作...
            }
        }
    }
}
