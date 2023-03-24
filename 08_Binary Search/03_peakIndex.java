// Peak index in mountain array.
// Link - https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class practice {

    public static int peakIndex(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;
        while (start<end)
        {
            if (arr[mid]< arr[mid+1])
                start = mid + 1;
            else
                end = mid;

            mid = (start+end)/2;
        }
        return start;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,3};
        System.out.println( peakIndex(arr));


    }
}

