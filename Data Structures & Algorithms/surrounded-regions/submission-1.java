class Solution {
    public void solve(char[][] board) {
        int rows=board.length;
        int cols=board[0].length;
        boolean [][] visited=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            //first and last cols
            if(board[i][0]=='O'){
                dfs(board,visited,i,0);
            }
            if(board[i][cols-1]=='O'){
                dfs(board,visited,i,cols-1);
            }

        }
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                dfs(board, visited, 0, j);
            }

            if (board[rows - 1][j] == 'O') {
                dfs(board, visited, rows - 1, j);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }

    }
    void dfs(char[][] board, boolean[][] visited, int i, int j) {
        int rows = board.length;
        int cols = board[0].length;

        if (i < 0 || j < 0 ||
            i >= rows || j >= cols ||
            board[i][j] == 'X' ||
            visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        dfs(board, visited, i + 1, j); // Down
        dfs(board, visited, i - 1, j); // Up
        dfs(board, visited, i, j + 1); // Right
        dfs(board, visited, i, j - 1); // Left
    }
}
