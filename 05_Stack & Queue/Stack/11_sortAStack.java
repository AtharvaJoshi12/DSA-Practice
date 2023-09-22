// Sort A Stack

import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortedInsert(Stack<Integer> s, int num){
		if(s.isEmpty() || (!s.isEmpty() && s.peek()< num)){
			s.push(num);
			return;
		}

		int n = s.pop();
		sortedInsert(s, num);
		s.push(n);

	}
	public static void sortStack(Stack<Integer> stack) {
		if(stack.isEmpty()){
			return;
		}

		int num= stack.pop();

		sortStack(stack);

		sortedInsert(stack,num);
	}

}