package Java;

import java.util.Arrays;

/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to
target. Return the sum of the three integers.
 */

//Problem: https://leetcode.com/problems/3sum-closest/

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int result = target;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
//                int sum = nums[i] + nums[start] + nums[end];
                int localDiff = Math.abs(target-(nums[i] + nums[start] + nums[end]));
                if (nums[i] + nums[start] + nums[end] > target) {
                    end--;
                } else {
                    start++;
                }
                if (localDiff < diff) {
                    diff = localDiff;
                    result = nums[i] + nums[start] + nums[end];
                }
            }
        }
        return result;
    }
}
