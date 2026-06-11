class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength=0;
        if(nums.length==0){return 0;}
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int s:set){
            int length=1;
            int current =s;
            if(!set.contains(s-1)){
                //starting counting 
                
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
            }
            maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }
}
