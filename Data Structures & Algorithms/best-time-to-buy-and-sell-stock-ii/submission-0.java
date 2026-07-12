class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=i+1;
        int profit=0;
        while(j<prices.length){
            if(prices[i]<prices[j]){
                profit+=prices[j]-prices[i];
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        return profit;
    }
}