// Find square root using Binary Search


public class practice {
    public static int squareRoot(int num){
        int start = 0;
        int end = num;
        int mid = (start+end)/2;
        int ans = -1;


        while(start<=end){
            int square = mid * mid;
            if(square == num)
                return mid;
            if (square>num) {
                end = mid - 1;
            }
            else {
                ans = mid;
                start = mid + 1;
            }

            mid = (start+end)/2;

        }
        return ans;
    }




    public static void main(String[] args) {
        System.out.println(squareRoot(9));

    }
}