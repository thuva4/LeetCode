package Java;

/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */

//Problem: https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] number = Integer.toString(x).toCharArray();
        boolean even = number.length%2==0 ? true : false;
        int middle = (number.length+1)/2;
        boolean isPalindrome = true;
        int i =0;
        int j = number.length-1;
        while(true){
            if(i==j){
                return true;
            }
            if(number[i]!=number[j]){
                return false;
            } else{
                if(even && j==i+1){
                    return true;
                }
            }
            i++;
            j--;
        }

    }
}
