// Book Allocation Problem
// Link - https://www.codingninjas.com/codestudio/problems/ayush-and-ninja-test_1097574?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2


public class practice {

    public static boolean isPossible(int []arr, int n, int m, int mid){
        int studentCount = 1;
        int pageSum = 0;
        for(int i = 0; i<n;i++){
            if(pageSum + arr[i] <=mid)
                pageSum += arr[i];

            else{
                studentCount++;
                if (studentCount>m || arr[i]>mid)
                    return false;
                pageSum = arr[i];
            }
        }
        return true;
    }
    public static int allocateBooks(int []arr,int n, int m){
        int s = 0;
        int sum = 0;
        for (int i = 0;i<arr.length;i++)
            sum += arr[i];

        int e = sum;
        int ans = -1;
        int mid = s + (e-s)/2;

        while(s<=e){
            if (isPossible(arr,n,m,mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }




    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        System.out.println(allocateBooks(arr,4,2));

    }
}