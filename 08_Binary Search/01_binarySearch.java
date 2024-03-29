public class practice {

    public static int binarySearch(int arr[],int key)
    {
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2; // We should use --> mid = start + (end - start)/2; For higher calculations

        while (start<=end)
        {
            if (arr[mid]== key)
                return mid;
            if (key > arr[mid])
                start = mid+1;
            else
                end = mid-1;

            mid = (start+end)/2;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int num , int start, int end , int arr[]){
        if (start > end)
            return -1;
        int mid = (start + end)/2;
        if(arr[mid]==num)
            return mid;
        if(num > arr[mid])
            return recursiveBinarySearch(num,mid+1,end,arr);

        return recursiveBinarySearch(num,start,mid-1,arr);
    }

    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
        System.out.println( binarySearch(arr,4));

    }
}

