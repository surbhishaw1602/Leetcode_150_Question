class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }

            int current_profit=prices[i]-min;
            if(current_profit>max){
                max=current_profit;
            }
        }


        return max;
        
    }
}
