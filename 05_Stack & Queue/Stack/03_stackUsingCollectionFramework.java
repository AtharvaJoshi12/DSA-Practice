// Stack using Collection Framework

import java.util.Stack;

public class practice {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Peek of stack - "+s.peek());

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

