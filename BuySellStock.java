public class BuySellStock {

    public static void main(String args[]) {

        /** Brutforce approach to find max profit of stock */
        int[] prices = { 7, 1, 5, 3, 11, 6, 4 };
       
        int res1 = brutForceApproach(prices);
        System.out.println("brutforce result" + res1);
        int res2 = optimizedApproach(prices);
        System.out.println("brutforce result" + res2);
    }

    public static int brutForceApproach(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            /** i + 1 , you can't sell previous day */
            for (int j = i + 1; j < prices.length; j++) {
                int profitGained = prices[j] - prices[i];
                if (maxProfit < profitGained) {
                    maxProfit = profitGained;
                }
            }
        }
        return maxProfit;
    }

    public static int optimizedApproach1(int[] prices) {
        int buyPrice = prices[0];
         int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                buyPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            }
        }
        return maxProfit;
    }
    public static int optimizedApproach2(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = prices[i] - buyPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
