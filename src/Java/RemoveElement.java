package Java;


/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/

//Problem: https://leetcode.com/problems/remove-element/


import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int size =  0;
        int legnth = nums.length;

        for ( int i = 0; i< legnth; i++) {
            if ( nums[i]!=val) {
                nums[size] = nums[i];
                size+=1;
            }
        }
        return size;
    }

    public static void main(String[] args){
        RemoveElement removeElement = new RemoveElement();
        int [] a = new int[4];
        a[0] = 3;
        a[1] = 4;
        a[2] = 3;
        a[3] = 4;
        System.out.println(removeElement.removeElement(a, 3));

    }
}
