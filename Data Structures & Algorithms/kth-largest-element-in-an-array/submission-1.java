class Solution {
    public int findKthLargest(int[] nums, int k) {
     PriorityQueue<Integer> pq=new PriorityQueue<>                    (Collections.reverseOrder()); 
     int j=1;  
    int limit=nums.length-k+1;
    for(int i: nums){
        pq.add(i);
        
        if(j>limit){
            pq.poll();
        }
        j++;
    }
    return pq.peek();

    }
}
