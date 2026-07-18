class Solution {
    public int minimumDifference(int[] nums, int k) {
      Arrays.sort(nums);
      int i=0;
      int j=k-1;
      int ans=Integer.MAX_VALUE;
      while(j<nums.length){
        int diff=nums[j]-nums[i];
        ans=Math.min(diff,ans);
        i++;
        j++;
      } 
      return ans; 
    }
}