// XOR is used 
// 1 XOR 1 = 0, 2 XOR 2 = 0 etc
// So we will do xor on complete array and the remaining element is unique element.

public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array) System.out.print(i + " ");
    }

    public static void findUnique(int[] array) {
       int answer = 0;
        for(int i = 0;i< array.length;i++)
        {
            answer = answer^array[i];
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        int []array = {1,1,2,4,2,4,5};
        findUnique(array);

    }
}
