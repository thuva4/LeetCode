package Java;

/*
Validate if a given string can be interpreted as a decimal number.
 */

// Problem: https://leetcode.com/problems/valid-number/

public class ValidNumber {
    public static void main(String [] args) {
        ValidNumber validNumber = new ValidNumber();
        System.out.println(validNumber.isNumber("+-."));
    }
    public boolean isNumber(String s) {
        s = s.trim();
        return isValid(s);
    }

    private boolean isValid(String s) {
        if (s.length()==0) {
            return false;
        }
        if(s.length()==1) {
            char numberChar = s.charAt(0);
            if(numberChar == '0' || numberChar == '1' || numberChar == '2' || numberChar == '3' || numberChar == '4' || numberChar == '5' || numberChar == '6' || numberChar == '7' || numberChar == '8' || numberChar == '9' ) {
                return true;
            }
        }
        if (s.charAt(0) == '-' || s.charAt(0)=='+') {
            s = s.substring(1);
        }
        if (s.contains("e")) {
            String [] splitNumbers = s.split("e");
            if (s.charAt(s.length()-1)=='e') {
                return false;
            }
            if (splitNumbers.length!=2) {
                return false;
            }
            if (splitNumbers[1].contains(".")) {
                return false;
            }
            return isValid(splitNumbers[0]) && isValid(splitNumbers[1]);
        }
        if (s.contains(".")) {
            long count = s.chars().filter(ch -> ch == '.').count();
            if(count!=1) {
                return false;
            }
            String [] splitNumbers = s.split("\\.");
            if (splitNumbers.length!=2 && splitNumbers.length!=1) {
                return false;
            }
            if (splitNumbers[0].isEmpty()) {
                if (s.charAt(0)!='.') {
                    return false;
                }
                if(splitNumbers[1].charAt(0) == '-' || splitNumbers[1].charAt(0) =='+') {
                    return false;
                }
                return isValid(splitNumbers[1]);
            }
            if (splitNumbers.length==1) {
                if (s.charAt(s.length()-1)!='.') {
                    return false;
                }

                return isValid(splitNumbers[0]);
            }
            if(splitNumbers[1].charAt(0) == '-' || splitNumbers[1].charAt(0) =='+') {
                return false;
            }
            return isValid(splitNumbers[0]) && isValid(splitNumbers[1]);
        }
        char [] numberChars = s.toCharArray();
        if( numberChars.length==0) {
            return false;
        }
        for (char numberChar : numberChars) {
            if(numberChar == '0' || numberChar == '1' || numberChar == '2' || numberChar == '3' || numberChar == '4' || numberChar == '5' || numberChar == '6' || numberChar == '7' || numberChar == '8' || numberChar == '9' ) {
                continue;
            }
            return false;
        }
        return true;
    }

}
