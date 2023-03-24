public class practice {

    public static void printArray(int arr[])
    {
        for (int i = 0;i< arr.length;i++)
            System.out.print(arr[i] + " ");
    }

    // Time complexity -> O(n^2)
    public static void bubbleSort(int arr[])
    {
        for(int i = 0;i< arr.length-1;i++){
            boolean swapped = false;
            for (int j = 0; j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    // swap
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,14,5,6,3};

        printArray(arr);
        bubbleSort(arr);
        System.out.println("After sorting");
        printArray(arr);

    }
}

