package cn.zhp.reflect;


import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ReflectTest2 {

        public static Object getValeByReflex(String key,Object obj)
        {
            //获取对象文件数组
            Field[] fieldes = obj.getClass().getDeclaredFields();
            for (Field field : fieldes) {
                //设置权限
                field.setAccessible(true);
                //field.getName() 获取属性名
                if(key.equals(field.getName()))
                {
                    try
                    {
                        //获取属性值   FIXME
                        Object o = field.get(obj);
                        System.out.println(o);
                        return o;

                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
            return null;
        }


        public static void main(String[] args) {

            PlatformBean bean = new PlatformBean("平台1", "连接1", "平台2", "连接2", null, null, null, null);

            List<TempPlat> platList = new ArrayList<TempPlat>();

            for(int i=1;i<5;i++)
            {
                String plat ="platName"+i;
                String link ="platLink"+i;
                plat = (String) getValeByReflex(plat, bean);
                link= (String) getValeByReflex(link, bean);
                if(StringUtils.isNotEmpty(plat)&&StringUtils.isNotEmpty(link))
                {
                    TempPlat temp = new TempPlat();
                    temp.setPlatName(plat);
                    temp.setPlatLink(link);
                    platList.add(temp);

                }
            }
            bean.setListPlat(platList);

            System.out.println(bean);


        }
    }



