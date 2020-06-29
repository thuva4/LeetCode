'''
Date: 29/06/2020
Link: https://leetcode.com/problems/first-missing-positive/ 
Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
Note:

Your algorithm should run in O(n) time and uses constant extra space.
'''

class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums.__len__() == 0:
            return 1
        if nums.__len__() == 1 and nums[0]!=1:
            return 1
        if nums.__len__() == 1 and nums[0]==1:
            return 2
        minNumbers = [0] * nums.__len__()
        for i in nums:
            if i <= nums.__len__() and i > 0:
                minNumbers[i-1] += 1
        for i in range (minNumbers.__len__()):
            if minNumbers[i] == 0:
                return i+1
        return nums.__len__() + 1