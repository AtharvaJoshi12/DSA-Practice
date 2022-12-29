// Link - https://www.codingninjas.com/codestudio/problems/sort-0-1-2_631055?topList=love-babbar-dsa-sheet-problems

public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array) System.out.print(i + " ");
    }

    public static void sort012(int[] array) {
        int low = 0;
        int mid = 0;
        int high = array.length-1;
        while(mid<=high)
        {
            if (array[mid]==0)
            {
                int temp = array[mid];
                array[mid] = array[low];
                array[low] = temp;
                mid++;
                low++;
            } else if (array[mid]==1) {
                mid++;
            }else {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int []array = {0,1,0,1,2};
        printArray(array);
        sort012(array);
        System.out.println();
        System.out.println("After sorting");
        printArray(array);

    }
}

