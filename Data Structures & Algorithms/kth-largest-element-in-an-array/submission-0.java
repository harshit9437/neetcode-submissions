class Solution {
    public int findKthLargest(int[] nums, int k) {
     PriorityQueue<Integer> pq=new PriorityQueue<>                    (Collections.reverseOrder());   
     for(int i:nums){
        pq.add(i);

     }
     int count=1;
     while(count<k){
        pq.poll();
        count++;
     }
     return pq.peek();
    }
}
