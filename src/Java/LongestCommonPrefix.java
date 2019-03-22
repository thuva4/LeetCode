package Java;

/*
Write a function to find the longest common prefix string amongst an array of strings.
 */

//Problem: https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        } else if(strs.length==1){
            return  strs[0];
        }

        int minLength =Integer.MAX_VALUE;
        for (int i=0;i<strs.length;i++){
            if(minLength>strs[i].length()){
                minLength = strs[i].length();
            }
        }
        String a = "";


        for(int i=0;i<minLength;i++){
            char chara = strs[0].charAt(i);
            boolean is = true;
            for (int j=1;j<strs.length;j++){
                if(chara!=strs[j].charAt(i)){
                    is = false;
                    break;
                }
            }
            if(is) {
                a = a + chara;
            } else {
                break;
            }
        }

        return a;
    }
}
