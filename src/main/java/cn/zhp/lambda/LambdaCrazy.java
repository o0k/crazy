package cn.zhp.lambda;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author zhp_e
 * @Date 22年10月16日, 0016 14:30
 * @Version 1.0
 */
public class LambdaCrazy {
    public static void main(String[] args) {
        //
        List<YourBean> yourBeanList
                = null;
        //单条件分组，
        Map<String, List<YourBean>> mapByOne = yourBeanList.stream().collect(Collectors.groupingBy(YourBean::getBillDateStr));

        //分组后，统计每组中数据量
        Map<String, Long> count = yourBeanList.stream().collect(Collectors.groupingBy(YourBean::getBillDateStr, Collectors.counting()));

        //分组后，求出每组中某属性的平均值 | Operator '!=' cannot be applied to 'boolean', 'null'
        Map<String, Double> avg = yourBeanList.stream().filter(i -> i.getGoodAmount() != null).
                collect(Collectors.groupingBy(YourBean::getBillDateStr, Collectors.averagingDouble(YourBean::getGoodAmount)));

        //分组，某属性求和
        Map<String, Double> sum = yourBeanList.stream().filter(i -> i.getGoodAmount() != null).
                collect(Collectors.groupingBy(YourBean::getBillDateStr, Collectors.summingDouble(YourBean::getGoodAmount)));

        //对求和的结果集进行从大到小排序
        Map<String, Double> finalMap = new LinkedHashMap<>();
        sum.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        //分组后，通过join组成新的map
        Map<String, String> joinNewMap = yourBeanList.stream().filter(i -> i.getGoodAmount() != null)
                .collect(Collectors.groupingBy(YourBean::getBillDateStr,
                        Collectors.mapping(i -> i.getGoodAmount().toString(), Collectors.joining(", ", "Post titles: [", "]"))));
        //2020-03-10
        //Post titles: [3.0, 1.0, 2.0, 3.0]

        //转换分组结果List -> Set
        Map<String, Set<String>> namesByName = yourBeanList.stream()
                .collect(Collectors.groupingBy(YourBean::getBillDateStr, Collectors.mapping(YourBean::getGoodName, Collectors.toSet())));
        // Set<String> x = namesByCity.keySet();

        //两个条件分组
        Map<String, Map<String, List<YourBean>>> mapByTwo = yourBeanList.stream()
                .collect(Collectors.groupingBy(YourBean::getBillDateStr, Collectors.groupingBy(YourBean::getGoodName)));

        //使用java8 stream groupingBy操作,按日期分组list,将List转化为name的List
        Map<String, List<String>> mapList = yourBeanList.stream()
                .collect(Collectors.groupingBy(YourBean::getBillDateStr, Collectors.mapping(YourBean::getGoodName, Collectors.toList())));
    }
}
