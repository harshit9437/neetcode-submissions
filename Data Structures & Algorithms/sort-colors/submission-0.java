class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        int[] arr=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            if(nums[k]==0){
                arr[i]=nums[k];
                i++;
            }else if(nums[k]==2){
                arr[j]=nums[k];
                j--;
            }else{
                count++;
            }
        }
        for(int l=i;l<=j;l++){
            arr[l]=1;
        }
        for(int l=0;l<nums.length;l++){
            nums[l]=arr[l];
        }

    }
}