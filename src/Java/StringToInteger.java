package Java;

/*
Implement atoi which converts a string to an integer.
 */

//Problem:  https://leetcode.com/problems/string-to-integer-atoi/
public class StringToInteger {
    public int myAtoi(String str) {
        str = str.trim();
        char[] strs = str.toCharArray();
        if(strs.length==0){
            return 0;
        }
        if(strs.length==1){
            if(strs[0]=='-' || strs[0]=='+'){
                return 0;
            }
        }
        if(strs[0]=='+' || strs[0]=='-' || Character.isDigit(strs[0])){
            boolean isNeg = false;
            str = "";
            if(strs[0]=='-'){
                isNeg = true;
            }
            int j =0;
            if(strs[0]=='+' || strs[0]=='-') {
                str = str + strs[0];
                j = 1;
            }
            for(int i=j; i<strs.length;i++){
                if(Character.isDigit(strs[i])){
                    str = str + strs[i];
                } else {
                    break;
                }
            }
            try {
                if(str.length()==1 && !Character.isDigit(str.charAt(0))) {
                    return 0;
                } else {
                    return Integer.parseInt(str);
                }
            } catch (Exception e){
                if(isNeg){
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        } else {
            return 0;
        }
    }
}
