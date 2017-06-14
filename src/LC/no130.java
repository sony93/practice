package LC;

/**
 * Created by Administrator on 2017/3/30.
 */
public class no130 {
    public static void main(String[] args){
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
    }

    int[] OIsBorder;
    int[] boardSet;

    public void solve(char[][] board){
        if(board.length == 0 || board[0].length == 0){
            return;
        }
        int height = board.length;
        int width = board[0].length;
        boardSet = new int[height * width];
        OIsBorder = new int[height * width];

        for (int i = 0; i < boardSet.length; i++){
            boardSet[i] = i;
            if((i/width == 0 || i/width == width - 1 || i % height == 0 || i % height == height - 1) && board[i/width][i%height] == 'O'){
                OIsBorder[i] = 1;
            }
            else
                OIsBorder[i] = 0;
        }



    }
}
