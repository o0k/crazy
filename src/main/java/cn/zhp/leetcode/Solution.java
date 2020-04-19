package cn.zhp.leetcode;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{4,2,5,2,5};
        int mm = singleNumber(nums);
        System.out.println(mm);
    }

    private static int singleNumber(int[] nums) {
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }
}

