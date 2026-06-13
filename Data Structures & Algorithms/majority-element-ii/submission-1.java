class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int length=nums.length/3;
        int count1=0;
        int ele1=Integer.MIN_VALUE;
        int count2=0;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && ele2!=nums[i]){
                count1=1;
                ele1=nums[i];
            }else if(count2==0 && ele1!=nums[i]){
                count2=1;
                ele2=nums[i];
            }else if(ele1==nums[i]){count1++;}
            else if(ele2==nums[i]){ count2++;}
            else{
                count1--;
                count2--;
            }
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                cnt1++;
            }if(nums[i]==ele2){
                cnt2++;
            }
            
        }
        if(cnt1>length){
            list.add(ele1);
        }
        if(cnt2>length){
            list.add(ele2);
        }
        

        return list;
    }
}