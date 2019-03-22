package Java;


/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to
display this pattern in a fixed font for better legibility)
 */

//Problem: https://leetcode.com/problems/zigzag-conversion/

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        String[] sArray = s.split("");
        int j = 0;
        String[] finalString = new String[numRows];
        for(int i=0;i<finalString.length;i++){
            finalString[i]="";
        }
        for(int i=0;i<sArray.length;i++){
            if(j>=0){
                if(j==numRows-1){
                    finalString[j] = finalString[j] + sArray[i];
                    j = j * -1;
                    if(j!=0) {
                        j += 1;
                    }
                } else {
                    finalString[j] = finalString[j] + sArray[i];
                    j+=1;
                }
            } else {
//                j+=1;
                finalString[j * -1] = finalString[j * -1] + sArray[i];
                j += 1;
            }

        }

        String finalS = "";
        for(String a : finalString){
            finalS+= a;
        }
        return finalS;
    }
}
