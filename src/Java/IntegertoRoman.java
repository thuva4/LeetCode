package Java;

/*
Given an integer, convert it to a roman numeral.
 */

//Problem: https://leetcode.com/problems/integer-to-roman/
public class IntegertoRoman {
    public String intToRoman(int num) {
        String finalNumber = "";
        if(num>=1000){
            int  x = num/1000;
            num = num%1000;
            for(int i=0;i<x;i++){
                finalNumber= finalNumber + "M";
            }
        }
        if(num==0){
            return finalNumber;
        }
        if(num>=900){
            num = num%900;
            finalNumber= finalNumber + "CM";
        }
        if(num==0){
            return finalNumber;
        }
        if(num>=500){
            int  x = num/500;
            num = num%500;
            for(int i=0;i<x;i++){
                finalNumber= finalNumber + "D";
            }
        }
        if(num==0){
            return finalNumber;
        }
        if(num>=400){
            num = num%400;
            finalNumber= finalNumber + "CD";
        }
        if(num==0){
            return finalNumber;
        }
        if(num>=100){
            int  x = num/100;
            num = num%100;
            for(int i=0;i<x;i++){
                finalNumber= finalNumber + "C";
            }
        }
        if(num==0){
            return finalNumber;
        }
        if(num>=90){
            num = num%90;
            finalNumber= finalNumber + "XC";
        }
        if(num==0){
            return finalNumber;
        }
        if(num>=50){
            int  x = num/50;
            num = num%50;
            for(int i=0;i<x;i++){
                finalNumber= finalNumber + "L";
            }

        }
        if(num==0){
            return finalNumber;
        }
        if(num>=40){
            num = num%40;
            finalNumber= finalNumber + "XL";
        }
        if(num==0){
            return finalNumber;
        }
        if(num>=10){
            int  x = num/10;
            num = num%10;
            for(int i=0;i<x;i++){
                finalNumber= finalNumber + "X";
            }

        }
        if(num==0){
            return finalNumber;
        }
        if(num>=9){
            num = num%9;
            finalNumber= finalNumber + "IX";
        }
        if(num==0){
            return finalNumber;
        }
        if(num>=5){
            int  x = num/5;
            num = num%5;
            for(int i=0;i<x;i++){
                finalNumber= finalNumber + "V";
            }
        }
        if(num==0){
            return finalNumber;
        }
        if(num==4){
            finalNumber= finalNumber + "IV";
        } else {
            for(int i=0;i<num;i++){
                finalNumber= finalNumber + "I";
            }
        }
        return finalNumber;
    }
}
