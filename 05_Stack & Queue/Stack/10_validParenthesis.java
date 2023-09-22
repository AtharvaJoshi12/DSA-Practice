// Valid Parenthesis

import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            //if opening bracket, stack push
            // else stacktop check and pop

            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    char top = st.peek();
                    if((ch == ')' && top == '(')||(ch == '}' && top == '{')||(ch == ']' && top == '[')){
                        st.pop();
                    }
                    else
                       return false;
                }
                else
                    return false;
            }
        } 

        if(st.isEmpty())
            return true;
        else
            return false;    
    }
}