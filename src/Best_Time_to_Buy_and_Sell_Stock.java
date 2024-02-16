public class Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }


    public static void main(String[] args){
        Best_Time_to_Buy_and_Sell_Stock bt = new Best_Time_to_Buy_and_Sell_Stock();
//        Kadane's Algorithm
        int max = bt.maxProfit(new int[]{7, 1, 4, 3, 6});
        System.out.println(max);


    }
}
