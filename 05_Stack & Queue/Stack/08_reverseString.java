// Reverse a string using stack

import java.util.Stack;


public class practice {

    public static String reverse(String S){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < S.length();i++){
            s.push(S.charAt(i));
        }
        String ans = "";
        while(!s.empty()){
           ans =  ans + s.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
     String s = reverse("Atharva");
     System.out.println(s);
    }
}