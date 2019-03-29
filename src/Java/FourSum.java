package Java;

import java.util.Arrays;
import java.util.List;

/*
Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that
a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 */

//Problem: https://leetcode.com/problems/4sum/

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            int j = i+1;
            int k = nums.length-1;
            int l= i + nums.length/2;

            while(j< l && k > l){
                int localSum = nums[i] + nums[j] + nums[k]+ nums[l];
                if(localSum>target){
                    k--;
                } else if(localSum<target){

                }
            }

        }
        return null;
    }
}
