//  Best Time to Buy and Sell Stock 1

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a
//  different day in the future to sell that stock.

// Link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array)
            System.out.print(i + " ");
    }
    public static void buySellStock(int[] array) {


            int maxprofit = 0;
            int minSoFar = array[0];

            for (int i = 1; i< array.length;i++)
            {
                minSoFar = Math.min(minSoFar,array[i]);
                int profit = array[i] - minSoFar;
                maxprofit = Math.max(maxprofit,profit);
            }
        System.out.println(maxprofit);
    }



    public static void main(String[] args) {
        int []array = {2,1,9,6};
        buySellStock(array);
    }
}

