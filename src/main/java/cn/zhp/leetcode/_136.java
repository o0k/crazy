package cn.zhp.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

 */
public class _136 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,2,5,2,5};
        int mm = mm(nums);

        System.out.println(mm);
    }

    public static int mm(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)){
                list.add(num);
            } else {
                list.remove(list.size() - 1);
            }
//            System.out.println("数组：" + Arrays.toString(nums));
            System.out.println(num);
            System.out.println("集合：" + list.toString());

        }
//        System.out.println("数组：" + Arrays.toString(nums));
        return list.get(0);
    }
}
