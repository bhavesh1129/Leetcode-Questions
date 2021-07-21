//Buy And Sell Stocks - Infinite Transactions Allowed

package EasyQuestions.Arrays;
import java.util.Scanner;

public class buyAndSellStocks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] prices = new int[num];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        buyAndSellStocksMultipleTransactionsAllowed(prices);
    }

    private static void buyAndSellStocksMultipleTransactionsAllowed(int[] prices) {
        int buyDate = 0;
        int sellDate = 0;
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= prices[i - 1]) {
                sellDate++;
            } else {
                totalProfit += prices[sellDate] - prices[buyDate];
                sellDate = buyDate = i;
            }
        }
        totalProfit += prices[sellDate] - prices[buyDate];
        System.out.println(totalProfit);
    }
}