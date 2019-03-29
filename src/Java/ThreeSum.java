package Java;

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets
in the array which gives the sum of zero.
 */

//Problem: https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arrayLists = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            int c = nums[i];
            if (nums[i] > 0) {
                break;
            }
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[j] == nums[j-1]){
                    j++;

                }
                if(nums[k]==nums[k-1]){
                    k--;
                }
               if(nums[j] + nums[k]== (-1) * c){
                   arrayLists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                   j++;
                   k--;
               }
               else if(nums[j] + nums[k]>(-1) * c){
                   k--;
               } else{
                   j++;
               }
            }
        }
        return arrayLists;
    }
}
