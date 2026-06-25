class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=piles[0];
        for(int i=1;i<piles.length;i++){
            maxPile=Math.max(maxPile,piles[i]);
        }
        int left=1;
        int right=maxPile;
        int ans=Integer.MAX_VALUE;
        while(left<=right){
            int mid=left+(right-left)/2;
            int totaltime=totalhr(piles,mid);
            if(totaltime<=h){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    public int totalhr(int[] arr,int k){
        int totalhrs=0;
        for(int i=0;i<arr.length;i++){
            totalhrs+=((arr[i]+k-1)/k);
        }
        return totalhrs;
    }
}
