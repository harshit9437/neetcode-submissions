class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int ans=0;
        while(left<right){
            int b=right-left;
            int l=Math.min(heights[left],heights[right]);
            int area=l*b;
            ans=Math.max(ans,area);
            if(heights[left]>heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}
