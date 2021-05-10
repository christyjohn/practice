package ds.lec01.stacks;

import java.util.Arrays;

/*
 * Input: an n-element array price of numbers such that price[i] is the price of the stock on day i
 * Output: an n-element array span of numbers such that span[i] is the span of the stock on day i
 * Span - number of days before where the price is lesser than or equal to today (inclusive)
 */
public class InefficientComputeSpan {
    public static void main(String[] args) {
        double[] prices = { 100.87, 98.76, 99.34, 99.12, 97.45, 98.99, 99.02, 99.34, 101.02, 103.43, 101.23, 101.23};
        double[] span = new double[prices.length];


        for (int i = 0; i < prices.length; i++) {
            int k = 0;
            boolean done = false;

            do {
                if(prices[i - k] <= prices[i])
                    k = k + 1;
                else
                    done = true;

            } while (k < i && done == false);
            span[i] =  k;
        }

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Span: " + Arrays.toString(span));
    }
}
