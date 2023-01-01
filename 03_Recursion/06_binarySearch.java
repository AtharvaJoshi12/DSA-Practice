
public class practice {
        public static boolean binarySearch(int array[],int start,int end,int key)
        {
            // base case
            if (start>end)
                return false;

            int mid = start+(end-start)/2;

            if (array[mid]==key)
                return true;

            if (array[mid]<key)
                return binarySearch(array,mid+1,end,key);
            else
                return binarySearch(array,start,mid-1,key);
        }

        public static void main(String[] args) {
            int array[] = {1,2,3,4,5};
            System.out.println(binarySearch(array,0,4,1));
        }
    }

