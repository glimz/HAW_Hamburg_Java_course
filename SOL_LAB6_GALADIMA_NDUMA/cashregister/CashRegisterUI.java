import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;  

/**
 * A UI for a CashRegister
 *
 * @author Wolf changeme!
 * @version 05/2018
 */
public class CashRegisterUI extends JFrame
{

    private JFrame _frame;
    private JPanel newPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private double money;

    /**
     * Constructor for objects of class CashRegisterUI
     * @param money the cost of a good
     */
    public CashRegisterUI(double money)
    {
        this.money = money;
        setupUI();
    }

    public void setupUI()
    {
        _frame = new JFrame("CashRegister");
        newPanel = new JPanel();

        //Creating new panels to hold the label
        panel1 = new JPanel ( new BorderLayout());
        panel2 = new JPanel ( new BorderLayout());
        panel3 = new JPanel ( new BorderLayout());

        //creating new labels and text fields for target       
        label1 = new JLabel("Target: ");
        text1 = new JTextField(10);
        text1.setText(""+ this.money);
        text1.setEnabled(false);

        //creating label for remainder
        label2 = new JLabel("Remainder: ");
        text2 = new JTextField(10);

        //labels for input
        label3 = new JLabel("Input: ");
        text3 = new JTextField(10);

        //adding labels to panels
        panel1.add(label1, BorderLayout.LINE_START); // panel 1 for Target
        panel1.add(text1,BorderLayout.LINE_END);

        panel2.add(label2,BorderLayout.LINE_START); // panel 2 for remainder
        panel2.add(text2,BorderLayout.LINE_END);

        panel3.add(label3,BorderLayout.LINE_START); //panel 3 for input
        panel3.add(text3,BorderLayout.LINE_END);

        //Adding panels 1,2,3 to the main panel
        newPanel.add(panel3,BorderLayout.PAGE_START); 
        newPanel.add(panel2,BorderLayout.PAGE_START);   
        newPanel.add(panel1,BorderLayout.PAGE_START);

        //Action listener for target text1       
        text1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String str="This is not an input.";
                    JOptionPane.showMessageDialog(_frame, str);   
                }
            });

        //Action listener for input text3     
        text3.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e){
                    int counter = 0;
                    String getInput = text3.getText().toString();
                    char [] pick = getInput.toCharArray();
                    for (int i = 0;i < pick.length;i++){
                        if ((pick[i] >= '0') && (pick[i] <= '9')){
                            counter++;
                        }
                    }

                    if (counter !=pick.length){                       
                        text3.setForeground (Color.red);
                        text2.setText("INPUT ERROR");

                    }
                    else {
                        text3.setForeground(Color.GREEN);
                        double input = Double.parseDouble(text3.getText().toString());
                        text2.setText( money - input+ "");
                        if (Double.parseDouble(text3.getText().toString()) <= 0){
                            text2.setForeground(Color.GREEN);
                        }
                        else if (Double.parseDouble(text2.getText().toString()) > 0){
                            text2.setForeground(Color.RED);
                        }
                    }

                }});
                /*
                //action listener for enter button
                //JButton enter = new JButton("Enter");
                //newPanel.add(enter, BorderLayout.NORTH);
                //enter.addActionListener(new ActionListener(){
                   // public void actionPerformed(ActionEvent e){
                    
                
                }
            });
            */
            //action listener for clear button
        JButton clear= new JButton("Clear");
        newPanel.add(clear, BorderLayout.SOUTH);
   
        clear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){

                    _frame.setVisible(false);
                    setupUI();
                }

            });

        _frame.add(newPanel);
        _frame.pack();   
        _frame.setSize(400, 400);  // configure the size 400px x 400px
        _frame.setLocationRelativeTo(null); // show the window at the center of the screen
        _frame.setVisible(true); // make it visible
    }

}
