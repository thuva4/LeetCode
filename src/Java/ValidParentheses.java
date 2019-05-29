package Java;

import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (char c: chars){
            if(c=='{' || c=='(' || c=='['){
                stack.push(c);
            }else {
                if(!stack.empty()) {
                    if (c == '}') {
                        if (stack.pop() != '{') {
                            return false;
                        }
                    }
                    if (c == ')') {
                        if (stack.pop() != '(') {
                            return false;
                        }
                    }
                    if (c == ']') {
                        if (stack.pop() != '[') {
                            return false;
                        }
                    }
                } else{
                    return false;
                }
            }
        }
        if(stack.empty()) {
            return true;
        }else {
            return false;
        }
    }
}
