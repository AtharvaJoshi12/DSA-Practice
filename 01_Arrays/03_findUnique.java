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
