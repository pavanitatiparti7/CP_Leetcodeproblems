class Solution {
    int nr=0;
    int nc=0;
    public void solve(char[][] board) {
        nr=board.length;
        nc=board[0].length;
        for(int col=0;col<nc;col++){  // row 0
        //identify 0 and check for connectivity (dfs)
            if(board[0][col]=='O'){
                dfs(board, 0, col);
            }
        }

        for(int col=0;col <nc;col++){  //last row
        //identify 0 and check for connectivity (dfs)
            if(board[nr-1][col]=='O'){
                dfs(board, nr-1, col);
            }
        }
        for(int row=0;row<nr;row++) { //col 0
            if(board[row][0]=='O'){
                dfs(board, row, 0);
            }
        }
        for(int row=0;row<nr;row++) { // last col
            if(board[row][nc-1]=='O'){
                dfs(board, row, nc-1);
            }
        }
        for(int row=0;row<nr;row++){
            for(int col=0;col<nc;col++){
                //visited ->0 
                if(board[row][col]=='V'){
                    board[row][col]='O';

                }
                //any node with 0 -> x 
                else{
                    board[row][col]='X';
                }
            }
        }        
    }
    public void dfs(char[][] board, int row, int col){
            if((row < 0) || (col < 0) || (row >= nr) || (col >= nc) || (board[row][col] != 'O')){
                return;
            }
            board[row][col]='V';
            dfs(board, row, col-1); //left
            dfs(board, row, col+1); //right
            dfs(board, row-1, col); //top
            dfs(board, row+1, col); //down
        } 
}
