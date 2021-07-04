// Buy And Sell Stocks - One Transaction Allowed

package EasyQuestions.Arrays;
import java.util.Scanner;

public class BuyAndSellStocks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] prices = new int[num];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        buyAndSellStocksOneTransactionAllowed(num, prices);
    }

    private static void buyAndSellStocksOneTransactionAllowed(int num, int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitIfSellToday = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < leastSoFar) {
                leastSoFar = prices[i];
            }
            profitIfSellToday = prices[i] - leastSoFar;
            if (profitIfSellToday > overallProfit) {
                overallProfit = profitIfSellToday;
            }
        }
        System.out.println(overallProfit);
    }
}
