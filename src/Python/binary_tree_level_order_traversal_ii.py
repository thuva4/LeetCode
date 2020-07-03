'''
Date: 03/07/2020
Link: https://leetcode.com/explore/featured/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3378/


Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    
    def decodeList(self, elements):
        return map(lambda x: x.val, elements)
    
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if root == None:
            return []
        
        levels = [[root]]
        i = 0
        while levels.__len__() > i:
            level = []
            for node in levels[i]:
                if node.left != None:
                    level.append(node.left)
                if node.right != None:
                    level.append(node.right)
            if level.__len__() > 0:
                levels.append(level)
            i += 1    
        return map(self.decodeList, levels)[::-1]
                