
/**
 * Write a description of interface TicTacToeGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface TicTacToeGame
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    public void placeStone(int x, int y); 
   
    public boolean isFreeField(int x, int y);
   
    public int getStone(int x, int y);
    
    public boolean didCurrentPlayerWin();
  
    public void switchPlayer();
   
    public void printBoard();
    
    public void resetGame();
    
   
}
