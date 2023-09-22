// Delete Middle Element

import java.util.LinkedList;
import java.util.Stack;


public class practice {

    public static void solve(Stack<Integer> inputStack,int count, int size){
        if(count == size/2){
            inputStack.pop();
            return;
        }
        int num = inputStack.pop();
        solve(inputStack,count+1,size);

        inputStack.push(num);
    }
    public static void deleteMiddle(Stack<Integer> inputStack, int N) {
        int count = 0;
        solve(inputStack,count,N);
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        deleteMiddle(s,5);
        System.out.println("After deleting Middle element");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}




