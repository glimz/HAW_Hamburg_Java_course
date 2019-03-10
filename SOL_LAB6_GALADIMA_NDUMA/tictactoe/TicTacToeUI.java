// CREDIT FOR PART OF THE COPIED CODES IN THE CLASS GIVEN TO: 
//Patrick Odom and Sheyi Oluwa 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class TicTacToeUI here.
 *
 * @author (Galadima Ahmed)
 * @version (a version number or a date)
 */
public class TicTacToeUI extends JFrame
{
    // TODO replace with TicTacToe-Interface
    private TicTacToeGame _game;
    //private Object _game;

    protected String playerOne = "Player one";
    protected String playerTwo = "Player two";
    protected int playerOneCount = 0;
    protected int playerTwoCount = 0;
    protected String playersTurn = "";

    private JFrame _frame;
    private JButton[] list;
    // JPanel declaration
    private JPanel panel;

    //JLabel for players name
    private JLabel label;

    private int [] game;

    private JLabel status;
    /**
     * Constructor for objects of class TicTacToeUI
     * @param game an instace of a TicTacToeGame
     */
    public TicTacToeUI(TicTacToeGame games) // TODO replace with TicTacToeInterface
    {
        list = new JButton[9];
        _game = games;
        setupUI();
        game = new int [9];

    }
    public void setupUI() 
    {
        _frame = new JFrame("TicTacToe");

        // add UI-elements to the JFrame
        JPanel contentPane = (JPanel)_frame.getContentPane();
        contentPane.setLayout(new BorderLayout(8, 8));

        // use JButton for the game elements
        GridLayout grid = new GridLayout(3, 3);

        // CODE CREDIT: Patrick/ Sheyi
        grid.setHgap(10);
        grid.setVgap(10);

        JPanel buttonPanel = new JPanel(grid);
        buttonPanel.setBackground(Color.WHITE);
        addNumberButton(buttonPanel, "0,0");
        addNumberButton(buttonPanel, "1,0");
        addNumberButton(buttonPanel, "2,0");

        addNumberButton(buttonPanel, "0,1");
        addNumberButton(buttonPanel, "1,1");
        addNumberButton(buttonPanel, "2,1");

        addNumberButton(buttonPanel, "0,2");
        addNumberButton(buttonPanel, "1,2");
        addNumberButton(buttonPanel, "2,2");
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        // use JLabel for showing the currently playing player
        status = new JLabel("Current Player is: Player X");
        contentPane.add(status, BorderLayout.SOUTH);
        
        _frame.setSize(400, 400);  // configure the size 400px x 400px
        _frame.setLocationRelativeTo(null); // show the window at the center of the screen
        _frame.setVisible(true); // make it visible
    }

    private void addButton(Container panel, String buttonToolTip)
    {
        JButton button = new JButton(buttonToolTip);
        button.setName(buttonToolTip);
        button.setText("");
        button.setBackground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 100));
        button.addActionListener(e -> { 
                Object source = e.getSource();
                if (source instanceof JButton) {
                    JButton btn = (JButton)source;
                    play(btn);
                }
            });
        panel.add(button);
    }

    private void addNumberButton(Container panel, String boxNumber)
    {
        addButton(panel, boxNumber);
    }

    private void play(JButton btn){
        String btnName = btn.getName();
        int x = (btnName.charAt(0) - 48);
        int y = (btnName.charAt(2) - 48);

        if(_game.isFreeField(x, y)){
            _game.placeStone(x, y);

            char curStone = (char)_game.getStone(x, y);
            String nextPlayer = "";
            if(curStone == 'X' ){
                nextPlayer = "O";
                btn.setForeground(Color.RED);
            } else { nextPlayer = "X"; }
            btn.setText(""+ curStone);

            if(_game.didCurrentPlayerWin()){

                JOptionPane.showMessageDialog(btn.getParent(), "Player "+btn.getText()+" Won!!!");
                _frame.dispose();
                System.exit(0);
                _game.resetGame();

            }
            _game.switchPlayer();
            status.setText("Current Player is: Player "+nextPlayer);
        }

    }

    protected void getplayerNames() {
        playerOne = JOptionPane.showInputDialog("Player one name:",JOptionPane.INFORMATION_MESSAGE);
        if (playerOne.equals("")) {
            playerOne = "Player one";
        }

        playerTwo = JOptionPane.showInputDialog("Player two name:");       

        if (playerTwo.equals("")) {
            playerTwo = "Player two";
        }
    }
}
