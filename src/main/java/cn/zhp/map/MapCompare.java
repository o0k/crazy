package cn.zhp.map;

import java.util.*;

public class MapCompare {
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isNull(Object obj, Class<?> clazz) {
        if (clazz.isAssignableFrom(obj.getClass())) {
            return obj == null;
        } else {
            throw new RuntimeException("obj type " + obj.getClass().getSimpleName() + " not matches " + clazz.getSimpleName());
        }
    }

    public static boolean notNull(Object obj) {
        return obj != null;
    }

    public static boolean notNull(Object obj, Class<?> clazz) {
        if (clazz.isAssignableFrom(obj.getClass())) {
            return obj != null;
        } else {
            throw new RuntimeException("obj type " + obj.getClass().getSimpleName() + " not matches " + clazz.getSimpleName());
        }
    }

    public static boolean deepEquals(Object obj1, Object obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        } else if (obj1 != null && obj2 != null) {
            Class<?> clazz1 = obj1.getClass();
            Class<?> clazz2 = obj2.getClass();
            if (clazz1.isAssignableFrom(clazz2) || clazz2.isAssignableFrom(clazz1)) {

                String className = clazz1.getName();

                if (className.equals("java.lang.String")) {
                    return ((String) obj1).equals((String) obj2);
                } else if (className.equals("java.lang.Integer")) {
                    return ((Integer) obj1).equals((Integer) obj2);
                } else if (className.equals("java.lang.Integer")) {
                    return ((Integer) obj1).equals((Integer) obj2);
                } else if (className.equals("java.lang.Double")) {
                    return ((Double) obj1).equals((Double) obj2);
                } else if (className.equals("java.lang.Float")) {
                    return ((Float) obj1).equals((Float) obj2);
                } else if (className.equals("java.util.Date")) {
                    return ((Date) obj1).equals((Date) obj2);
                } else if (className.equals("java.sql.Date")) {
                    return ((java.sql.Date) obj1).equals((java.sql.Date) obj2);
                } else if (className.equals("java.sql.Time")) {
                    return ((java.sql.Time) obj1).equals((java.sql.Time) obj2);
                } else if (className.equals("java.sql.Timestamp")) {
                    return ((java.sql.Timestamp) obj1).equals((java.sql.Timestamp) obj2);
                } else if (className.equals("java.lang.Integer")) {
                    return ((Integer) obj1).equals((Integer) obj2);
                } else if (className.equals("java.lang.Integer")) {
                    return ((Integer) obj1).equals((Integer) obj2);
                } else if (className.contains("List")) {
                    return ((java.util.List<?>) obj1).size() == ((java.util.List<?>) obj2).size() &&
                            ((java.util.List<?>) obj1).containsAll((java.util.List<?>) obj2);
                } else if (className.contains("Map")) {
                    Map map1 = (Map) obj1;
                    Map map2 = (Map) obj2;
                    if (map1.size() != map2.size()) {
                        return false;
                    }

                    Iterator iterator = map1.entrySet().iterator();
                    while (iterator.hasNext()) {
                        if (!map2.containsKey(iterator.next())) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    throw new RuntimeException("unSupport java type: " + className);
                }
            } else {
                throw new RuntimeException("obj type " + clazz1.getSimpleName() + " not matches " + clazz2.getSimpleName());
            }

        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean compare = deepEquals("1","1");
        boolean b2 = deepEquals(Arrays.asList("1", "2", "3"), Arrays.asList("1", "2"));
        boolean b3 = deepEquals(new Date(), new Date(System.currentTimeMillis() - 30000));
        boolean b4 = deepEquals(new java.sql.Date(0), new java.sql.Date(0));
        boolean b5 = deepEquals(1, 2);
        boolean b6 = deepEquals(1.3, Double.valueOf(5));
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1","1");
        boolean b7 = deepEquals(hashMap, new HashMap<String, String>());

        boolean null1 = isNull(1.0, Integer.class);



    }
}

