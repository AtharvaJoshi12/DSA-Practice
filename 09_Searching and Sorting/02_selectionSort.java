public class practice {

    public static void printArray(int arr[])
    {
        for (int i = 0;i< arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    public static void selectionSort(int arr[])
    {
       for(int i = 0;i< arr.length-1;i++){
           int smallest = i;
           for(int j = i+1;j< arr.length;j++){
               if (arr[smallest]>arr[j])
                   smallest = j;
           }
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
       }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,14,5,6,3};

        printArray(arr);
        selectionSort(arr);
        System.out.println("After sorting");
        printArray(arr);

    }
}

