// Binary search in 2D Array


public class practice {

    public static boolean searchInMatrix(int [][]matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row*col - 1;

        int mid = start + (end - start)/2;

        while(start<=end)
        {
            int element = matrix[mid/col][mid%col];

            if (element == target)
                return true;
            if (element<target)
                start = mid + 1;
            else
                end = mid - 1;
            mid = start + (end - start)/2;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]arr = {{10,11,12,13,14}, {20,21,22,23,24}, {30,31,32,33,34}, {40,41,42,43,44}};

        System.out.println(searchInMatrix(arr,43));
    }
}