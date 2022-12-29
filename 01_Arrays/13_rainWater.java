// Trapping Rain water Problem
// Link - https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1

import java.util.Scanner;


public class practice {

    public static void rainWater(int[] array) {
        int n = array.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0]=array[0];
        for(int i = 1; i<n;i++)
            left[i] = Math.max(left[i-1],array[i]);

        right[n-1] = array[n-1];
        for (int i = n-2;i>=0;i--)
            right[i]=Math.max(right[i+1],array[i]);

        int ans = 0;
        for(int i = 0;i<n;i++)
            ans += (Math.min(left[i],right[i] ) - array[i]);

        System.out.println(ans);
        }

    public static void main(String[] args) {
        int []array = {3,1,2,4,0,1,3,2};
        rainWater(array);
    }
}

