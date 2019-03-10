
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ghost
 */
public class TicTacToeFrame extends javax.swing.JFrame {

    private String whoseTurn = "x";
    private String playerOne = "Player one";
    private String playerTwo = "Player two";
    private int playerOneCount = 0;
    private int playerTwoCount = 0;
    private String playersTurn = "";

    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeFrame() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        getplayerNames();
        setScores();
        setPlayerName();
    }

    private void tieGame() {

        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton_7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();

        if (one != "" && two != "" && three != "" && four != "" && five != ""
                && six != "" && seven != "" && eight != "" && nine != "") {

        }

    }

    private void getplayerNames() {
        playerOne = JOptionPane.showInputDialog(this, "Player one name:",
                "Player Name", JOptionPane.INFORMATION_MESSAGE);
        if (playerOne.equals("")) {
            playerOne = "Player one";
        }

        playerTwo = JOptionPane.showInputDialog(this, "Player two name:",
                "Player Name", JOptionPane.INFORMATION_MESSAGE);
        if (playerTwo.equals("")) {
            playerTwo = "Player two";
        }
    }

    private void determineWhoseTurn() {
        if (whoseTurn.equalsIgnoreCase("R")) {
            whoseTurn = "0";
        } else {
            whoseTurn = "x";
        }
    }

    private void setScores() {

        jLabel_Scores.setText(playerOne + "`s Score is: " + String.valueOf(playerOneCount)
                + "\t          " + playersTurn + "`s move" + playerTwo + "`s Score is : " + String.valueOf(playerTwoCount));

    }

    private void setPlayerName() {

        if (whoseTurn.equalsIgnoreCase("x")) {

            playersTurn = playerOne;
        } else {
            playersTurn = playerTwo;
        }
        jLabel_Scores.setText(playerOne + "`s Score is: " + String.valueOf(playerOneCount)
                + "\t          " + playersTurn + "`s move" + playerTwo + "`s Score is : " + String.valueOf(playerTwoCount));
    }

    private void xWins() {

        JOptionPane.showMessageDialog(this, playerOne + " wins", "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        playerOneCount++;
        resetGame();

    }

    private void oWins() {

        JOptionPane.showMessageDialog(this, playerTwo + " wins", "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        playerTwoCount++;
        resetGame();

    }

    private void resetGame() {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton_7.setText("");
        jButton8.setText("");
        jButton9.setText("");

        setScores();

    }

    private void determineIfWin() {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton_7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();

        if (one == "x" && two == "x" && three == "x") {

            oWins();

        }

        if (four == "x" && five == "x" && six == "x") {

            oWins();

        }

        if (seven == "x" && eight == "x" && nine == "x") {

            oWins();

        }

        if (one == "x" && four == "x" && seven == "x") {

            oWins();

        }

        if (two == "x" && five == "x" && eight == "x") {

            oWins();

        }

        if (three == "x" && six == "x" && nine == "x") {

            oWins();

        }

        if (seven == "x" && five == "x" && three == "x") {

            oWins();

        }

        if (one == "x" && five == "x" && nine == "x") {

            oWins();

        }
        // if o wins 
        if (one == "o" && two == "o" && three == "o") {

            oWins();

        }

        if (four == "o" && five == "o" && six == "o") {

            oWins();

        }

        if (seven == "o" && eight == "o" && nine == "o") {

            oWins();

        }

        if (one == "o" && four == "o" && seven == "o") {

            xWins();

        }

        if (two == "o" && five == "o" && eight == "o") {

            oWins();

        }

        if (three == "o" && six == "o" && nine == "o") {

            oWins();

        }

        if (seven == "o" && five == "o" && three == "o") {

            oWins();

        }

        if (one == "o" && five == "o" && nine == "o") {

            oWins();

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1_scoresHolder = new javax.swing.JLabel();
        jPanel2_GridHolder = new javax.swing.JPanel();
        jPanel_bnt_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel_bnt_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_bnt_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_bnt_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_bnt_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_bnt_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_bnt_7 = new javax.swing.JPanel();
        jButton_7 = new javax.swing.JButton();
        jLabel_Scores = new javax.swing.JLabel();
        jPanel_bnt_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel_bnt_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton7.setText("jButton7");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setBackground(new java.awt.Color(222, 216, 210));

        jPanel1.setBackground(new java.awt.Color(183, 178, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1_scoresHolder.setText("Place holder for scores");
        jPanel1.add(jLabel1_scoresHolder, java.awt.BorderLayout.PAGE_END);

        jPanel2_GridHolder.setBackground(new java.awt.Color(149, 143, 137));
        jPanel2_GridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel_bnt_1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel_bnt_1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_bnt_1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_bnt_1);

        jPanel_bnt_2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel_bnt_2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_bnt_2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_bnt_2);

        jPanel_bnt_3.setBackground(new java.awt.Color(253, 252, 251));
        jPanel_bnt_3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_bnt_3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_bnt_3);

        jPanel_bnt_4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel_bnt_4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_bnt_4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_bnt_4);

        jPanel_bnt_5.setBackground(new java.awt.Color(252, 252, 252));
        jPanel_bnt_5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_bnt_5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_bnt_5);

        jPanel_bnt_6.setBackground(new java.awt.Color(251, 250, 250));
        jPanel_bnt_6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_bnt_6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_bnt_6);

        jPanel_bnt_7.setBackground(new java.awt.Color(253, 251, 250));
        jPanel_bnt_7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_7.setLayout(new java.awt.BorderLayout());

        jButton_7.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });
        jPanel_bnt_7.add(jButton_7, java.awt.BorderLayout.CENTER);

        jLabel_Scores.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel_Scores.setText("Scores:");
        jPanel_bnt_7.add(jLabel_Scores, java.awt.BorderLayout.PAGE_END);

        jPanel2_GridHolder.add(jPanel_bnt_7);

        jPanel_bnt_8.setBackground(new java.awt.Color(254, 254, 254));
        jPanel_bnt_8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_bnt_8.add(jButton8, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Player 1:");
        jPanel_bnt_8.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel2_GridHolder.add(jPanel_bnt_8);

        jPanel_bnt_9.setBackground(new java.awt.Color(251, 250, 250));
        jPanel_bnt_9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel_bnt_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Ubuntu", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_bnt_9.add(jButton9, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Player 2:");
        jPanel_bnt_9.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        jPanel2_GridHolder.add(jPanel_bnt_9);

        jPanel1.add(jPanel2_GridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_7ActionPerformed
        // TODO add your handling code here:
        jButton_7.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton_7.setForeground(Color.red);
        } else {
            jButton_7.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();

    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.red);
        } else {
            jButton1.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
         setPlayerName();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handlng code here:
        jButton2.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.red);
        } else {
            jButton2.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
         setPlayerName();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton4.setForeground(Color.red);
        } else {
            jButton4.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
         setPlayerName();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton5.setForeground(Color.red);
        } else {
            jButton5.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
         setPlayerName();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         jButton6.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton6.setForeground(Color.red);
        } else {
            jButton6.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
         setPlayerName();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.red);
        } else {
            jButton8.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
         setPlayerName();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton9.setForeground(Color.red);
        } else {
            jButton9.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
         setPlayerName();

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.red);
        } else {
            jButton3.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
         setPlayerName();

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_7;
    private javax.swing.JLabel jLabel1_scoresHolder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Scores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2_GridHolder;
    private javax.swing.JPanel jPanel_bnt_1;
    private javax.swing.JPanel jPanel_bnt_2;
    private javax.swing.JPanel jPanel_bnt_3;
    private javax.swing.JPanel jPanel_bnt_4;
    private javax.swing.JPanel jPanel_bnt_5;
    private javax.swing.JPanel jPanel_bnt_6;
    private javax.swing.JPanel jPanel_bnt_7;
    private javax.swing.JPanel jPanel_bnt_8;
    private javax.swing.JPanel jPanel_bnt_9;
    // End of variables declaration//GEN-END:variables
}
