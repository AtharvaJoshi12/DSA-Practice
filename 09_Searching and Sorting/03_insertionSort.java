public class practice {

    public static void printArray(int arr[])
    {
        for (int i = 0;i< arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    public static void insertionSort(int arr[])
    {
       for(int i = 1;i< arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current< arr[j]){
                arr[j+1]= arr[j];
                j--;
            }

            arr[j+1]= current;
       }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,14,5,6,3};

        printArray(arr);
        insertionSort(arr);
        System.out.println("After sorting");
        printArray(arr);

    }
}

