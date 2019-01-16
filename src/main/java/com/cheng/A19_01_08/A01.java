package com.cheng.A19_01_08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 9:49 2019/1/8
 * @Reference:
 */
public class A01 {
    public static void main(String[] args) {


    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < map.size(); i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if (map.containsKey(v) && i != map.get(v)) {
                result[0] = i;
                result[1] = map.get(v);
                return result;
            }
        }

        return result;

      /*  int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < map.size(); i++) {
            map.put(i, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int v = target - map.get(i);
            if (map.containsValue(v) && )
        }*/
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] n = new int[2];
        int[] ints = Arrays.copyOf(n, nums.length);
        Arrays.sort(ints);
        int start = 0;
        int end = 0;
        for (int i = 0; i < ints.length; i++) {
            int num = target - ints[i];
            int i1 = Arrays.binarySearch(ints, num);
            if (i1 != i && i1 > 0) {
                start = ints[i];
                end = ints[i1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == start)
                n[0] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == end && i != n[0])
                n[1] = i;
        }

        return n;
    }

}