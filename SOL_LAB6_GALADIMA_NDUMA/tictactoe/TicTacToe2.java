/**
 * TicTacToe using a 2-d Array as gameboard
 *
 * https://en.wikipedia.org/wiki/Tic-tac-toe
 *
 * @author Wolf Changeme!
 * @version 05/2018
 */
public class TicTacToe2 extends ATicTacToe
{
    // holds the current player
    //private int _currentPlayer;

    // holds the current player
    private int[][] _gameboard = new int[3][3];

    /**
     * Constructor for TicTacToe
     */
    public TicTacToe2()
    {
        _currentPlayer ='X';

    }

    /**
     * places a stone at position [x,y]
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public void placeStone(int x, int y) 
    {
        if(isFreeField(x, y)){
            if (_currentPlayer == 'X'){
                _gameboard[x][y] = 'X';
            } else {
                _gameboard[x][y] = 'O';
            }
        }

    }

    /**
     * places a stone at position [x,y]
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public boolean isFreeField(int x, int y)
    {
        if(_gameboard[x][y] == 0)
            return true;
        return false;
    }

    /**
     * places a stone at position [x,y]
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public int getStone(int x, int y)
    {
        return _gameboard[x][y];
    }

    /**
     * places a stone at position [x,y]
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public boolean didCurrentPlayerWin()
    {
        // what are the requirements to win?
        if((_gameboard[0][0] == _currentPlayer) && (_gameboard[1][1] == _currentPlayer)
        && (_gameboard[2][2] == _currentPlayer)){
            return true;
        }
        else if((_gameboard[0][0] == _currentPlayer) && (_gameboard[1][1] == _currentPlayer)
        && (_gameboard[2][2] == _currentPlayer)){
            return true;
        }
        else if((_gameboard[0][1] == _currentPlayer) && (_gameboard[1][1] == _currentPlayer)
        && (_gameboard[2][1] == _currentPlayer)){
            return true;
        }
        if((_gameboard[0][2] == _currentPlayer) && (_gameboard[1][2] == _currentPlayer) 
        && (_gameboard[2][2] == _currentPlayer)){
            return true;
        }
        if((_gameboard[2][0] == _currentPlayer) && (_gameboard[1][1] == _currentPlayer) 
        && (_gameboard[0][2] == _currentPlayer)){
            return true;
        }
        if((_gameboard[0][0] == _currentPlayer) && (_gameboard[0][1] == _currentPlayer)
        && (_gameboard[0][2] == _currentPlayer)){
            return true;
        }
        if((_gameboard[1][0] == _currentPlayer) && (_gameboard[1][1] == _currentPlayer)
        && (_gameboard[1][2] == _currentPlayer)){
            return true;
        }
        if((_gameboard[2][0] == _currentPlayer) && (_gameboard[2][1] == _currentPlayer)
        && (_gameboard[2][2] == _currentPlayer)){
            return true;
        }

        return false;
    }

    /*
     * switches the player after every move

    public void switchPlayer()
    {

    }*/

    /**
     * Prints the board to the console for debugging purposes
     */
    public void printBoard() 
    {
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                System.out.println();

    }

}
