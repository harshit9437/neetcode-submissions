class Solution {
    public int singleNumber(int[] nums) {
        int index=0;
        for(int i:nums){
            index=index^i;
        }
        return index;
    }
}
