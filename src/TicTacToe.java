public class TicTacToe
{
    public static final int X = 1, O = -1;
    public static final int EMPTY = 0;


    public int player = X;
    private GameBoard board = new GameBoard();
    public boolean isEmpty = false;

    public enum Position {
        X, O
    }


    /*
        return@: the char marking for the player.
     */
    public char getPlayerMarking(int player){
        if (player == 1){
            return 'X';
        }
        return 'O';
    }

    /*
        returns@: true is the move is in valid position
        not occupied by another player
     */
    public boolean isValidMove(int pos){
        if(pos<1 || pos>9){
            return false;
        }
        if(board.getMarkingAtPosition(pos) != board.EMPTY_BOARD_SPACE){
            return false;
        }
        return true;
    }

    /** Puts an X or O mark at pos. */
    public boolean makeMove(int pos)
    {
        if(!isValidMove(pos)){
            return false;
        }else {
            board.markPositionWithChar(getPlayerMarking(player), pos);
            player = -player;       // switch players (uses fact that O = - X)
            return true;
        }
    }

    /** Checks whether the board configuration is a win for the given player. */
    public boolean isWin(int player)
    {
        return board.markingHasWon(getPlayerMarking(player));

    }

    /**display the winning player or indicate a tie (or unfinished game).*/
    public void displayWinner()
    {
        if(isWin(X))
        {
            System.out.println("\n X wins...!!");
            isEmpty=false;
        }
        else if(isWin(O))
        {
            System.out.println("\n O wins...!!");
            isEmpty=false;
        }
        else
        {
            if(!isEmpty)
            {
                System.out.println("its a tie");
            }

        }
    }



    public String toString()
    {
        String boardString = board.toString();
        isEmpty = board.getHasEmptySlot();
        return boardString;
    }
}