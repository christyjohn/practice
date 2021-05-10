package ds.lec01.stacks;

import java.util.Arrays;

public class EfficientComputeSpan {
    public static void main(String[] args) throws StackEmptyException, StackFullException {
        double[] prices = { 100.87, 98.76, 99.34, 99.12, 97.45, 98.99, 99.02, 99.34, 101.02, 103.43, 101.23, 101.23};
        double[] span = new double[prices.length];

        ArrayStack theStack = new ArrayStack(prices.length);

        for (int i = 0; i < prices.length; i++) {
            int h = 0;
            int k = 0;
            boolean done = false;

            while (!theStack.isEmpty() && done == false ) {
                int index = Integer.parseInt(theStack.top().toString());
                if (prices[i] >= prices[index])
                    theStack.pop();
                else
                    done = true;
            }

            if (theStack.isEmpty())
                h = -1;
            else
                h = Integer.parseInt(theStack.top().toString());

            span[i] = i - h;
            theStack.push(i);
        }

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Span: " + Arrays.toString(span));
    }
}
