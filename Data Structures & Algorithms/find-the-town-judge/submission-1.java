class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] trustGiven=new int[n+1];
        int [] trustReceived=new int[n+1];
        for(int i=0;i<trust.length;i++){
                trustGiven[trust[i][0]]++;
                trustReceived[trust[i][1]]++;
            
        }
        for(int i=1;i<=n;i++){
            if(trustGiven[i]==0 && trustReceived[i]==n-1){
                return i;
            }
        }
        return -1;
    }
    
    
}