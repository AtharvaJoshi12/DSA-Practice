// Search in a Rotated and Sorted array


public class practice {

    public static int binarySearch(int arr[],int s , int e, int key)
    {
        int start = s;
        int end = e;
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
    public static int getPivot(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int mid = s + (e-s) / 2;

        while(s<e){
            if(arr[mid]>=arr[0])
                s = mid + 1;
            else
                e = mid;

            mid = s + (e-s) / 2;
        }
        return s;
    }


    public static int findPosition(int arr[],int k){
        int pivot = getPivot(arr);

        if(k >= arr[pivot] && k<= arr[arr.length-1])
            return binarySearch(arr,pivot, arr.length-1,k);
        else
            return binarySearch(arr,0,pivot-1,k);
    }
    public static void main(String[] args) {
      int arr[]= {3,8,10,17,1};
      System.out.println("Elemnt is at position " + findPosition(arr,10));

    }
}