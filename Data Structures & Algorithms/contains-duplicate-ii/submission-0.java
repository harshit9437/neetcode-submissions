class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        while(i<n-1){
            int j=i+1;
            while(j<n){
                int diff=Math.abs(i-j);
                if(nums[i]==nums[j] && diff<=k){
                    return true;
                }else{
                    j++;
                }
            }
            i++;
        }
        return false;
    }
}