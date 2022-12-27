public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array) System.out.print(i + " ");
    }

    public static void swapAlternate(int[] array) {
        int start = 0;
        int start2 = 1;
        int temp; 
       while (start2<array.length)
        {
            temp = array[start];
            array[start] = array[start2];
            array[start2] = temp;
            start = start+2;
            start2 = start2+2;
        }
    }
    public static void main(String[] args) {
        int []array = {1,2,3,4,5};
        printArray(array);
        swapAlternate(array);
        System.out.println();
        System.out.println("After swapping:");
        printArray(array);
    }
}
