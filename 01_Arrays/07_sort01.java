public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array) System.out.print(i + " ");
    }

    public static void sort01(int[] array) {
        int start = 0;
        int end = array.length-1;
        while (start<end)
        {

            while (array[start]==0 && start<end)
                start++;
            while (array[end]==1 && start<end)
                end--;

            if (start<end)
            {
                array[start]=0;
                array[end]=1;
                start++;
                end--;
            }

        }

    }
    public static void main(String[] args) {
        int []array = {0,1,0,1,0,1,0};
        printArray(array);
        sort01(array);
        System.out.println();
        System.out.println("After sorting");
        printArray(array);

    }
}

