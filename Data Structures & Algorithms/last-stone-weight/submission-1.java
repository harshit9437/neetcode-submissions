class Solution {
    PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());
    public int lastStoneWeight(int[] stones) {
        for(int i: stones){
            pq.add(i);
        }
        compareStones(pq);
        if(pq.size()==0) return 0;
        return pq.peek();
    }
    public void compareStones(PriorityQueue<Integer> pq){
        if(pq.size()==1 || pq.size()==0){
            return ;
        }
        int x=pq.poll();
        int y=pq.poll();
        if(x==y){
            compareStones(pq);
        }else if(x<y){
            pq.add(y-x);
            compareStones(pq);
        }else{
            pq.add(x-y);
            compareStones(pq);
        }
    }
}
