class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int cap=0;
        int max=0;
        for(int i:weights){
            cap+=i;
            max=Math.max(max,i);

        }
        int left=max;
        int right=cap;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int currentLoad=0;
            int count=1;
            for(int i:weights){
                if(currentLoad+i<=mid){
                    currentLoad+=i;
                    
                }else{
                    currentLoad=0;
                    currentLoad+=i;
                    count++;
                }
            }
            if(count<=days){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }

            
        }
        return ans;
    }
}