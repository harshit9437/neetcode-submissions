class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int [] passengers=new int[1001];
        for(int [] trip: trips){
            int numPassenger=trip[0];
            int from=trip[1];
            int to=trip[2];
            passengers[from]+=numPassenger;
            passengers[to]-=numPassenger;
        }
        int currPassenger=0;
        for(int i=0;i<1001;i++){
            currPassenger+=passengers[i];
            if(currPassenger>capacity){
                return false;
            }
        }
        return true;
    }
}