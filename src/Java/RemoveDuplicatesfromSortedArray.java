package Java;

/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 */

//Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int length = 1;
        int last = nums[0];
        for(int num : nums){
            if(num!=last){
                length+=1;
                last=num;
                nums[length-1]=num;
            }
        }
        return length;
    }
}
