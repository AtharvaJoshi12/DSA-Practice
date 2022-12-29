// Find the "Kth" max and min element of an array 
// Link - https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array)
            System.out.print(i + " ");
    }

    public static void kthSmallest(int array[],int k)
    {
        Arrays.sort(array);
        System.out.println("Kth smallest : "+array[k-1]);
        System.out.println("Kth Largest : "+array[array.length - k]);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[]={1,4,8,2,5,7};
        kthSmallest(array,3);

    }
}

