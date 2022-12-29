// Buy and Sell Stocks 2

// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

//  On each day, you may decide to buy and/or sell the stock.
//  You can only hold at most one share of the stock at any time. However, 
//  you can buy it then immediately sell it on the same day.

// Link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array)
            System.out.print(i + " ");
    }
    public static void buySellStock(int[] array) {
        int profit = 0;
        for(int i = 1;i<array.length;i++)
        {
            if (array[i]>array[i-1])
                profit += array[i]-array[i-1];
        }
        System.out.println(profit);
    }



    public static void main(String[] args) {
        int []array = {2,1,9,6,10};
        buySellStock(array);
    }
}

