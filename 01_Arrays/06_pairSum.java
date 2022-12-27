// Find all the pairs such that their addition is equal to given sum. 

public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array) System.out.print(i + " ");
    }

    public static void pairSum(int[] array, int sum) {
        for (int i = 0; i< array.length;i++)
        {
            for (int j = i+1;j< array.length;j++)

            {
                if ((array[i]+array[j]) == sum)
                     System.out.println(array[i] + " "+array[j] );
            }
        }
    }
    public static void main(String[] args) {
        int []array = {1,2,3,2};
        pairSum(array,4);

    }
}

