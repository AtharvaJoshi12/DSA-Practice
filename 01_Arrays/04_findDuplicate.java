// Again XOR is used 
// Example array is {1,3,2,3}
// So here in first loop we will perform xor of 1^3^2^3
// And in second loop (1^3^2^3) ^ 1^2^3 

public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array) System.out.print(i + " ");
    }

    public static void findDuplicate(int[] array) {
       int answer = 0;
        for(int i = 0;i< array.length;i++)
        {
            answer = answer^array[i];
        }
        for (int i = 1;i< array.length;i++)
        {
            answer = answer ^ i;
        }
        System.out.println(answer);

    }
    public static void main(String[] args) {
        int []array = {1,5,2,4,3,5};
        findDuplicate(array);

    }
}

