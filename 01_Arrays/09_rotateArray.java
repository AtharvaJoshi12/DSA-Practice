import java.util.Scanner;

public class practice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int [] array = new int[n];
        // Initializing array elements
        for(int i = 0;i<n;i++)
            array[i]=sc.nextInt();
        int k = sc.nextInt(); // No. of times to rotate

        int newArray[] = new int[n];
        int j= k;
        //Example Original array = 7 5 2 11 2 43 1 1 we have to rotate by k = 2
        // so in new answer array store 2 11 2 43 1 1    i.e. elements > k
        for(int i = 0 ;i<n-k;i++)
        {
            newArray[i] = array[j];
            j++;
        }

        // Now add 7 5 at last  
        j = 0;
        for(int i = (n-k);i<n;i++){
            newArray[i] = array[j];
            j++;
        }

        for(int i = 0;i< n;i++)
            System.out.print(newArray[i] + " ");

    }
}

