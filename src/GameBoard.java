public class GameBoard{


    private char[][] board = new char[3][3];
    public static char EMPTY_BOARD_SPACE = '\u0000';


    /*
        Places marking at the specified pos
     */
    public void markPositionWithChar(char marking, int pos){
        Coordinate cord = Coordinate.getCoordinateFromPosition(pos);
        board[cord.x][cord.y] = marking;
    }

    /*
       returns@  marking at the specified pos
    */
    public char getMarkingAtPosition(int pos){
        Coordinate cord = Coordinate.getCoordinateFromPosition(pos);
        return board[cord.x][cord.y];
    }

    /*
        returns@ a concatenated string of markings from three positions
     */
    private String getThreePositionsAsString(int pos1, int pos2, int pos3){
        return new StringBuilder()
                .append(getMarkingAtPosition(pos1))
                .append(getMarkingAtPosition(pos2))
                .append(getMarkingAtPosition(pos3))
                .toString();
    }


    /*
        returns@ true if marking has won the game with three in a row
     */
    public boolean markingHasWon(char marking)
    {
        String threeInARow = new StringBuilder().append(marking).append(marking).append(marking).toString();

        // check for row win
        if(getThreePositionsAsString(1,2,3).equals(threeInARow)
                ||getThreePositionsAsString(4,5,6).equals(threeInARow)
                || getThreePositionsAsString(7,8,9).equals(threeInARow)){
            return true;
        }


        // check for column win
        if(getThreePositionsAsString(1,4,7).equals(threeInARow)
                ||getThreePositionsAsString(2,5,8).equals(threeInARow)
                || getThreePositionsAsString(3,6,9).equals(threeInARow)){
            return true;
        }

        // check for diagnol win
        if(getThreePositionsAsString(1,5,9).equals(threeInARow)
                ||getThreePositionsAsString(3,5,7).equals(threeInARow)){
            return true;
        }

        return false;
    }

    /*
    return@ this as a string with play marking or positions (if none)

    ie:
    Game Board Positions:

     1  | 2  | 3
    -----------
     4  | 5  | 6
    -----------
     7  | 8  | 9

     */
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        int count = 1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j] != EMPTY_BOARD_SPACE){
                    s.append(" "+board[i][j]+"  ");
                }//else empty
                else{
                    s.append(" "+count+"  ");
                }

                if(j<2)
                {
                    s.append("|");
                }
                count++;

            }
            if(i<2)
            {
                s.append("\n-----------\n");
            }
        }
        return s.toString();
    }

    public boolean getHasEmptySlot() {
        for(int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                if(board[i][j] == EMPTY_BOARD_SPACE){
                    return true;
                }
            }
        }

        return false;
    }



}
