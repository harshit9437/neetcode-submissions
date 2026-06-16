class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=i+1;
        while(i<numbers.length-1){
            if(j==numbers.length){
                i++;
                j=i+1;
            }
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
                }
                j++;
            }
        return new int[]{-1,-1};
  }
}
