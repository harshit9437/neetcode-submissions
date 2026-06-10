class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int maj=n/2;
        
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>maj){
             ans=nums[i];
            }
        }
        return ans;

    }
}