package Java;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//Problem: https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> lookupmap = new HashMap<>();
        int [] solution = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(lookupmap.containsKey(target-nums[i])){
                solution[0] = lookupmap.get(target-nums[i]);
                solution[1] = i;
                return solution;
            }
            if(!lookupmap.containsKey(nums[i])) {
                lookupmap.put(nums[i], i);
            }
        }
        return solution;
    }
}
