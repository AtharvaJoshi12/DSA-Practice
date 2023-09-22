

public class practice {
     static class Stack{
        int arr[] = new int[5];
        int top = -1;

        public void push(int data){
            if(arr.length - top > 1){
                top++;
                arr[top] = data;
            }
            else
                System.out.println("Stack Full");
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int data = arr[top];
            top--;
            return data;
        }
        public int peek(){
            return arr[top];
        }
        public boolean isEmpty(){
            return top == -1;
        }

    }


    public static void main(String[] args) {
       Stack s = new Stack();
       System.out.println(s.isEmpty());
       s.push(1);
       s.push(2);
       s.push(3);

       System.out.println("Peek : " + s.peek());
       while(!s.isEmpty())
           System.out.println(s.pop());
    }
}