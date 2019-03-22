package Java;

/*
Given a 32-bit signed integer, reverse digits of an integer.
 */

//Problem: https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public  int reverse(int x){
        String s = "";
        boolean loopA = true;
        boolean isNega = (x<0) ? true : false;
        while (loopA){
            s =  s+ Math.abs(x%10);
            x = x/10;
            if(x==0){
                loopA=false;
            }
        }
        if(isNega){
            s="-" + s;
        }
        try {
            return Integer.parseInt(s);
        } catch (Exception e){
            return 0;
        }

    }
}
