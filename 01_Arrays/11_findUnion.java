import java.util.Scanner;


public class practice {

    public static void findUnion(int[] array1,int[] array2) {
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j])
                System.out.print(array1[i++] + " ");
            else if (array2[j] < array1[i])
                System.out.print(array2[j++] + " ");
            else {
                System.out.print(array2[j++] + " ");
                i++;
            }
        }

        /* Print remaining elements of
         the larger array */
        while (i < array1.length)
            System.out.print(array1[i++] + " ");
        while (j < array2.length)
            System.out.print(array2[j++] + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array1 = {1,2,3,4,5};
        int []array2 = {1,2,3 };
        findUnion(array1,array2);

    }
}

