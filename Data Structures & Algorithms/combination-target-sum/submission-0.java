class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        findComb(nums,0,target,list,new ArrayList<>());
        return list;
    }
    public void findComb(int[] arr,int idx,int target,List<List<Integer>> list,List<Integer> ds){
        if(idx==arr.length){
            if(target==0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findComb(arr,idx,target-arr[idx],list,ds);
            ds.remove(ds.size()-1);
        }
        findComb(arr,idx+1,target,list,ds);
    }
}
