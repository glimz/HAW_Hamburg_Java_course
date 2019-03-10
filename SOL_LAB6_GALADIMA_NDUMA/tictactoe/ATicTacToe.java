import javax.swing.*;
import java.awt.*;
/**
 * Abstract class ATicTacToe - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ATicTacToe implements TicTacToeGame
{
    // instance variables - replace the example below with your own

    protected JButton jButton1 = new JButton();
    protected JButton jButton2 = new JButton();
    protected JButton jButton3 = new JButton();
    protected JButton jButton4 = new JButton();
    protected JButton jButton5 =  new JButton();
    protected JButton jButton6 = new JButton();
    protected JButton jButton7 = new JButton();
    protected JButton jButton8 = new JButton();
    protected JButton jButton9 = new JButton();
    protected String playersTurn = "";
    protected int _currentPlayer = 'X';

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public void switchPlayer(){
        if (_currentPlayer == 'X') {
            _currentPlayer = 'O';
        } else {
            _currentPlayer = 'X';
        }
    }
    
     public void resetGame() {
            jButton1.setText("");
            jButton2.setText("");
            jButton3.setText("");
            jButton4.setText("");
            jButton5.setText("");
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton9.setText("");

        }  
    
    public abstract boolean didCurrentPlayerWin();
}
