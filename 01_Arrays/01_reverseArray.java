
import java.util.* ;
public class timepass {

    public static void printArray(int array[])
    {
        for (int j : array) System.out.print(j + " ");
    }

    public static void linearSearch(int array[],int element)
    {
        for (int i = 0;i< array.length;i++)
        {
            if(element == array[i])
                System.out.println("Element found at position : " + i);
        }
    }

    public static void reverseArray(int array[])
    {
        int temp;
        int start = 0;
        int end = array.length-1;
        while(start<=end)
        {
            temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;

        }

    }
    public static void main(String[] args) {

       int [] array = {1,2,3,4};
//       linearSearch(array,4);
       printArray(array);
       reverseArray(array);
       System.out.println();
       System.out.println("After reverse");
       printArray(array);

    }
}
