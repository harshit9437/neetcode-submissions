class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        int i=0;
        while(i<n-3){
            if(i > 0 && nums[i] == nums[i-1]){
        i++;
        continue;
    }
            int j=i+1;
            while(j<n-2){
                if(j > i+1 && nums[j] == nums[j-1]){
                    j++;
                    continue;
                }

                int k=j+1;
                int l=n-1;
                while(k<l){
                long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];                    if(sum>target){
                        l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }
                }
                j++;
            }
            i++;
        }
        return new ArrayList<>(set);
    }
}