class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        recursivePermute(nums,list,ds,freq); 
        return list;
    }
    void recursivePermute(int [] nums,List<List<Integer>> list,
            List<Integer> ds,boolean[] freq  ){
            if(ds.size()==nums.length){
                list.add(new ArrayList<>(ds));
                return;
            }               
            for(int i=0;i<nums.length;i++){
                if(!freq[i]){
                    freq[i]=true;
                    ds.add(nums[i]);
                    recursivePermute(nums,list,ds,freq);
                    ds.remove(ds.size()-1);
                    freq[i]=false;
                }
            } 
                           }

}
