class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int i=0;
        int n=prices.length;
        while(i<n-1){
            int j=i+1;
            while(j<n){
                int profit=prices[j]-prices[i];
                maxProfit=Math.max(maxProfit,profit);
                j++;
            }
            i++;
        }
        return maxProfit;
    }
}
