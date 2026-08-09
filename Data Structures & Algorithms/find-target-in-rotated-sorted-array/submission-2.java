class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        return helper(nums,left,right,target);
    }
    int helper(int[]nums,int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid =left+(right-left)/2;
        if(nums[mid]==target) return mid;
        if(nums[mid]>=nums[left]){
            if(target>=nums[left] && target<nums[mid]){
                return helper(nums,left,mid-1,target);
            }else{
                return helper(nums,mid+1,right,target);
            }
        }else{
            if(target<=nums[right] && target>nums[mid]){
                return helper(nums,mid+1,right,target);
            }else{
                return helper(nums,left,mid-1,target);
            }
            
        }
    }
}
