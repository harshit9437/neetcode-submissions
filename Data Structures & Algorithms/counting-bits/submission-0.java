class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<arr.length;i++){
            int k=i;
            while(k!=0){
                k=k&(k-1);
                arr[i]++;
            }
        }
    return arr;
    }
}
