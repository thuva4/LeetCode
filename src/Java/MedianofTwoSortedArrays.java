package Java;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */

//Problem: https://leetcode.com/problems/median-of-two-sorted-arrays/

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j =0;
        int k =0;
        boolean even = false;
        double medianFoorIndex = 0;
        double medianCeilIndex =0;
        int max= nums1.length + nums2.length;
        if(max%2!=0){
            even = true;
            medianFoorIndex = ((nums1.length + nums2.length)/2);
        } else {
            medianFoorIndex = Math.floor((nums1.length + nums2.length +1)/2.0 -1);
            medianCeilIndex = Math.ceil((nums1.length + nums2.length +1 )/2.0 -1);
        }
        int [] finalArray = new int[max];
        while(i<max && j< max){
            if(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                    finalArray[k]= nums1[i];
                    i+=1;

                } else {
                    finalArray[k]= nums2[j];
                    j+=1;
                }
            } else if(i<nums1.length){
                finalArray[k]= nums1[i];

                i+=1;
            } else if(j<nums2.length){
                finalArray[k]= nums2[j];
                j+=1;
            }
            if(even){
                if(medianFoorIndex==k){
                    return finalArray[k];
                }
            } else {
                if(medianFoorIndex==k-1 && medianCeilIndex==k){
                    return (finalArray[k-1]+finalArray[k])/2.0;
                }
            }
            k+=1;
        }
        return 0;
    }
}
