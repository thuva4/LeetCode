package Java;

import java.util.ArrayList;

/*
Given a string, find the length of the longest substring without repeating characters.
 */

// Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int max = 1;
        for (int i=0;i<s.length()-1;i++){
            ArrayList<Character> characterArrayList = new ArrayList();
            characterArrayList.add(s.charAt(i));
            int localMax = 1;
            for( int j=i+1; j<s.length(); j++){
                if(!characterArrayList.contains(s.charAt(j))){
                    localMax = localMax +1;
                    characterArrayList.add(s.charAt(j));
                }
                else {
                    break;
                }
                max = Math.max(max, localMax);
            }
        }
        return max;
    }
}
