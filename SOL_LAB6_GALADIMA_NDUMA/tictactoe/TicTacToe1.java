
/**
 * TicTacToe using a 1-d Array as gameboard
 * 
 * https://en.wikipedia.org/wiki/Tic-tac-toe
 *
 * @author Wolf Changeme!
 * @version 05/2018
 */
public class TicTacToe1 extends ATicTacToe
{
    // holds the game state
    private int[] _gameboard;

    /**
     * Constructor for TicTacToe
     */
    public TicTacToe1()
    {
       
        _gameboard = new int[9];
         _currentPlayer = 'X';

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
                _gameboard[x+3*y] = 'X';
            } else {
                _gameboard[x+3*y] = 'O';
            }
        }

    }

    /**
     * Is the field located at [x,y] still playable?
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public boolean isFreeField(int x, int y)
    {
        if(_gameboard[x+3*y] == 0){
            return true;
        }
        return false;
    }

    /**
     * returns the current stone at position [x,y]
     * @param x the x-coordinate
     * @param y the y-coordinate 
     */
    public int getStone(int x, int y)
    {
         return _gameboard[x+3*y];
    }

    /**
     * Did the current player win?
     */
    public boolean didCurrentPlayerWin()
    {
        // what are the requirements to win?
        if((_gameboard[0] == _currentPlayer) && (_gameboard[1] == _currentPlayer) 
        && (_gameboard[2] == _currentPlayer)){
    		return true;
    }
    	else if((_gameboard[3] == _currentPlayer) && (_gameboard[4] == _currentPlayer)
    	&&(_gameboard[5] == _currentPlayer)){
    		return true;
    }
    	else if((_gameboard[6] == _currentPlayer) && (_gameboard[7] == _currentPlayer) 
    	&& (_gameboard[8] == _currentPlayer)){
    		return true;
    }
    
    	else if((_gameboard[0] == _currentPlayer) && (_gameboard[3] == _currentPlayer) 
    	&& (_gameboard[6] == _currentPlayer)){
    		return true;
    }
    	else if((_gameboard[1] == _currentPlayer) && (_gameboard[4] == _currentPlayer) 
    	&& (_gameboard[7] == _currentPlayer)){
    		return true;
    }
    	else if((_gameboard[2] == _currentPlayer) && (_gameboard[5] == _currentPlayer) 
    	&& (_gameboard[8] == _currentPlayer)){
    		return true;
    }
    	else if((_gameboard[2] == _currentPlayer) && (_gameboard[4] == _currentPlayer) 
    	&& (_gameboard[6] == _currentPlayer)){
    		return true;
    }
    	else if((_gameboard[0] == _currentPlayer) && (_gameboard[4] == _currentPlayer) 
    	&& (_gameboard[8] == _currentPlayer)){
    		return true;
    }
        return false;
    }


    /**
     * Prints the board to the console for debugging purposes
     */
    public void printBoard() 
    {
        for(int i = 0; i < 9; i++ ){   		
    		System.out.println(_gameboard[i]+ " ");
    		if(i % 3 == 0) System.out.println("\n");
    	}

    }
}
