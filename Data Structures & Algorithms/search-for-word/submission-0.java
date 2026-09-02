class Solution {
    public boolean exist(char[][] board, String word) {
        char[] arr=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==arr[0] && wordExists(board,i,j,arr,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean wordExists(char[][] board,int i,int j,char[] arr
    ,int idx){
        if(i<0||j<0||i>=board.length||j>=board[0].length|| board[i][j]=='*'|| board[i][j]!=arr[idx]){
            return false;
        }
        if(idx==arr.length-1){
            return true;
        }
        char ch=board[i][j];
        board[i][j]='*';
        boolean result=wordExists(board,i+1,j,arr,idx+1)||
        wordExists(board,i-1,j,arr,idx+1)||
        wordExists(board,i,j+1,arr,idx+1)||
        wordExists(board,i,j-1,arr,idx+1);
        board[i][j]=ch;
        return result;
    }
}
