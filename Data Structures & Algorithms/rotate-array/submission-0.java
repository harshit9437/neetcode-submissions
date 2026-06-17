class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        for(int l=0;l<k;l++){
            int j=nums.length-1;
            int temp=nums[j];
            while(j>0){
                nums[j]=nums[j-1];
                j--;
            }
            nums[i]=temp;
        }

    }
}