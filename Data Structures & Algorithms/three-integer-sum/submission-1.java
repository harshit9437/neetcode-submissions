class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> seen=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(seen.contains(third)){
                    List<Integer> temp=Arrays.asList(
                        nums[i],nums[j],third
                    );
                    Collections.sort(temp);
                    set.add(temp);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}
