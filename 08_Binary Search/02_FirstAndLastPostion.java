// Find first and last position of an element in Sorted array.
// https://www.codingninjas.com/codestudio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2

public class practice {

    public static int firstPosition(int arr[],int key)
    {
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end)
        {
            if (arr[mid]== key)
            {
                ans = mid;
                end = mid - 1;
            }
            else if (key > arr[mid])
                start = mid+1;
            else
                end = mid-1;

            mid = (start+end)/2;
        }
        return ans;
    }
    public static int lastPosition(int arr[],int key)
    {
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end)
        {
            if (arr[mid]== key)
            {
                ans = mid;
                start = mid + 1;
            }
            else if (key > arr[mid])
                start = mid+1;
            else
                end = mid-1;

            mid = (start+end)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,4,4,6};
        System.out.println( firstPosition(arr,4));
        System.out.println( lastPosition(arr,4));

    }
}

